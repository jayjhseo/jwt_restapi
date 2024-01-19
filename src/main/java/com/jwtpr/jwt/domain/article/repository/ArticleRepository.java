package com.jwtpr.jwt.domain.article.repository;

import com.jwtpr.jwt.domain.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
