package com.jwtpr.jwt.domain.article.service;

import com.jwtpr.jwt.domain.article.entity.Article;
import com.jwtpr.jwt.domain.article.repository.ArticleRepository;
import com.jwtpr.jwt.domain.member.entity.Member;
import com.jwtpr.jwt.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;
    public RsData<Article> write (Member author, String subject, String content) {
        Article article = Article
                .builder()
                .author(author)
                .subject(subject)
                .content(content)
                .createdDate(LocalDateTime.now())
                .build();

        articleRepository.save(article);
        return RsData.of("S-3", "성공", article);
    }
}
