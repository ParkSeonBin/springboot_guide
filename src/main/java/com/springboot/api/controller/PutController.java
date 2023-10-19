package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    //@RequestBody를 활용한 PUT 메서드 구현
    @PutMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> putdata) { //어떤 값이 들어오는지 모를땐 Map
        StringBuilder sb = new StringBuilder();

        putdata.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }
    @PutMapping(value = "/member1") //content-type : text/plain
    public String postMemberDto1(@RequestBody MemberDto memberDto) { //어떤 값이 들어오는지 아는 경우
        return memberDto.toString();
    }
    @PutMapping(value = "/member2") //content-type : application/json
    public MemberDto postMemberDto2(@RequestBody MemberDto memberDto) { //json 형식으로 전달됨
        return memberDto;
    }

    //ResponseEntity를 활용한 PUT 메서드 구현
    @PutMapping(value = "/member3")
    public ResponseEntity<MemberDto> postMemberDto3(@RequestBody MemberDto memberDto) { //응답 코드 변경 가능, Header와 body 손쉽게 구성
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(memberDto);
    }
}

