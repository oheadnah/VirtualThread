package com.virtualthread.service;

import com.virtualthread.mapper.MemberMapper;
import com.virtualthread.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {

    @Autowired
    private MemberMapper mapper;

    public MemberService( MemberMapper mapper ) {

        this.mapper = mapper;
    }

    @Transactional
    public void createMember( Member member ) {

        System.out.println("start");
        mapper.insertMember( member.getName() );
        System.out.println("stop");

    }
}
