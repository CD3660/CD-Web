package com.cd.cd_web;

import com.cd.cd_web.member.MemberInfo;
import com.cd.cd_web.member.MemberRole;
import com.cd.cd_web.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.stream.IntStream;

@SpringBootTest
public class MemberInfoTest {
    @Autowired
    private MemberRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void insertDummies(){
        IntStream.rangeClosed(1,100).forEach(i -> {
            MemberInfo memberInfo = MemberInfo.builder()
                    .email("user"+i+"@cdweb.com")
                    .name("사용자"+i)
                    .fromSocial(false)
                    .password(passwordEncoder.encode("0000"))
                    .build();
            memberInfo.addMemberRole(MemberRole.USER);
            if(i>80){
                memberInfo.addMemberRole(MemberRole.MANAGER);
            }
            if(i>90){
                memberInfo.addMemberRole(MemberRole.ADMIN);
            }
            repository.save(memberInfo);
        });
    }
}
