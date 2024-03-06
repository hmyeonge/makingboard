package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @GetMapping("/board/write") // 어떤 URL 로 접근할 것인지를 지정 -> localhost:8080/board/write -> boardwrite.html 문서를 보여줌
    public String boardWriteForm(){

        return "boardwrite"; // 어떤 HTML 파일로 보낼지를 결정
    }
}