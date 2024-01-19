package com.jwtpr.jwt.domain.member.controller;

import com.jwtpr.jwt.domain.member.entity.Member;
import com.jwtpr.jwt.domain.member.service.MemberService;
import com.jwtpr.jwt.global.jwt.JwtProvider;
import com.jwtpr.jwt.global.rsData.RsData;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.ALL_VALUE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/member", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
public class MemberController {
    private final MemberService memberService;

    @Data
    public static class LoginRequest {
        @NotBlank
        private String username;
        @NotBlank
        private String password;
    }
    //DTO
    @AllArgsConstructor
    @Getter
    public static class LoginResponse {
        private final String accessToken;
    }
    @PostMapping(value = "/login", consumes = APPLICATION_JSON_VALUE)
    public RsData<LoginResponse> login(@Valid @RequestBody LoginRequest loginRequest) {
        String accessToken = this.memberService.genAccessToken(loginRequest.getUsername(), loginRequest.getPassword());

        return RsData.of("S-1", "액세스 토큰이 생성되었습니다", new LoginResponse(accessToken));
    }
    @AllArgsConstructor
    @Getter
    public static class MeResponse {
        private final Member member;
    }
    @GetMapping(value = "/me", consumes = ALL_VALUE)
    public RsData<MeResponse> me (@AuthenticationPrincipal User user) {
        Member member = memberService.findByUsername(user.getUsername()).get();
        return RsData.of("S-2", "성공", new MeResponse(member));
    }
}
