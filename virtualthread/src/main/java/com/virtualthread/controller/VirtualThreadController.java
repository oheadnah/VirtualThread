package com.virtualthread.controller;

import com.virtualthread.model.Member;
import com.virtualthread.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/virtual" )
@RequiredArgsConstructor
public class VirtualThreadController {

    private final MemberService memberService;

    @GetMapping
    public ResponseEntity virtualThreadTest() throws InterruptedException {

//        Thread.sleep(10000);
        memberService.createMember( new Member( "oheadnah" ) );

        return new ResponseEntity<>( HttpStatus.OK );
    }
}
