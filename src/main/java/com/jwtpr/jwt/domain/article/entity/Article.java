package com.jwtpr.jwt.domain.article.entity;

import com.jwtpr.jwt.domain.member.entity.Member;
import com.jwtpr.jwt.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Article extends BaseEntity {
    @ManyToOne
    private Member author;
    private String subject;
    private String content;
}
