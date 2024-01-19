package com.jwtpr.jwt.domain.member.controller;

import com.jwtpr.jwt.global.jwt.JwtProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.transaction.annotation.Transactional;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
@ActiveProfiles("test")
class MemberControllerTest {
    @Autowired
    private MockMvc mvc;
    @Autowired
    private JwtProvider jwtProvider;

    @Test
    @DisplayName("POST /member/login 은 로그인 처리 URL 이다.")
    void t1() throws Exception {
        // When
        ResultActions resultActions = mvc
                .perform(
                        post("/api/v1//member/login")
                                .content("""
                                        {
                                            "username": "user1",
                                            "password": "1234"
                                        }
                                        """.stripIndent())
                                .contentType(new MediaType(MediaType.APPLICATION_JSON, StandardCharsets.UTF_8))
                )
                .andDo(print());

        // Then
        resultActions
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.resultCode").value("S-1"))
                .andExpect(jsonPath("$.msg").exists())
                .andExpect(jsonPath("$.data.accessToken").exists());
    }
    @Test
    @DisplayName("로그인 토큰 발급 검증")
    void t2() throws Exception {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", 1L);
        claims.put("username", "user1");

        String accessToken = jwtProvider.genToken(claims, 60 * 10);
        System.out.println("accessToken :" + accessToken);

        assertThat(jwtProvider.verify(accessToken)).isTrue();
        Map<String, Object> claimsFromToken = jwtProvider.getClaims(accessToken);
        System.out.println("claimsFromToken :" + claimsFromToken);
    }
    @Test
    @WithUserDetails("user1")
    @DisplayName("GET /member/me 는 내 정보를 조회하는 URL 이다.")
    void t3() throws Exception {
        // When
        ResultActions resultActions = mvc
                .perform(
                        get("/api/v1/member/me")
                )
                .andDo(print());

        // Then
        resultActions
                .andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("$.resultCode").value("S-2"))
                .andExpect(jsonPath("$.msg").exists())
                .andExpect(jsonPath("$.data.member.username").value("user1"));
    }
}
