package com.momo.member;

import com.momo.utils.ReflectionUtil;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void findByEmail() {
        //given
        final String email = "test@email.com";
        final String password = "1234";

        final Member member = ReflectionUtil.generateInstance(Member.class);
        ReflectionUtil.setter("email", email, member);
        ReflectionUtil.setter("password", password, member);

        //when
        memberRepository.save(member);

        //then
        final Optional<Member> findMember = memberRepository.findByEmail(email);
        Assertions.assertThat(findMember).isNotEmpty();
    }

}