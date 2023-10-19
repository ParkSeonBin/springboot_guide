package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    //@RequestMapping으로 구현하기
    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample() {
        return "Hello Post Api";
    }

    //@RequestBody를 활용한 POST 메서드 구현
    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData) {   //RequestBody를 사용하면 method 정의 X
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
    return sb.toString();
    }
    @PostMapping(value = "/member2")
    public String postMemberDto(@RequestBody MemberDto memberDto) { //어떤 값이 들어오는지 아는 경우
        return memberDto.toString();
    }
}
