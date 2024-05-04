package com.cd.cd_web.repository;


import com.cd.cd_web.member.MemberInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberInfo, String> {
}
