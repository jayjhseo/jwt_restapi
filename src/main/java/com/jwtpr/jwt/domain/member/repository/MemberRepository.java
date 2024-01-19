package com.jwtpr.jwt.domain.member.repository;

import com.jwtpr.jwt.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long>{
    Optional<Member> findByUsername(String username);
}
