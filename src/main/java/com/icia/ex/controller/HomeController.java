package com.icia.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 나는 이 클래스를 컨트롤러 클래스로 사용할 것이다. 클라이언트의 요청을 controller로 와서 체크함
public class HomeController {
    // 프로젝트 실행시 기본주소(/) 요청 메서드 선언
    // 프로젝트 시작하면 index.jsp를 브라우저에 출력
    @GetMapping("/")
    public String index(){
        return "index"; //index.jsp
    }
}
