package com.kuricompany.springboot4developer.service;

import com.kuricompany.springboot4developer.entity.Member;
import com.kuricompany.springboot4developer.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}
