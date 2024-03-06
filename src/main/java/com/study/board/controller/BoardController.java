package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    /*
    BoardService 타입 객체에 대한 의존성 주입(DI) 를 자동으로 처리
    @Autowired 어노테이션으로 스프링이 관리하는 빈 중 해당 타입과 일치하는 빈을 찾아 자동으로 연결함
    BoardController 클래스 내에서 BoardService 의 메소드를 사용할 수 있게 됨
     */
    @Autowired // 스프링이 자동으로 BoardService 타입에 맞는 빈(bean)을 찾아 boardService 참조변수를 할당함
    private BoardService boardService; // BoardService 타입의 객체를 사용하기 위한 참조변수를 선언함

    @GetMapping("/board/write") // 어떤 URL 로 접근할 것인지를 지정 -> localhost:8080/board/write -> boardwrite.html 문서를 보여줌
    public String boardWriteForm(){

        return "boardwrite"; // 어떤 HTML 파일로 보낼지를 결정
    }

    // 내용이 넘어오는 것을 확인
    @PostMapping("/board/writepro") // 매개변수로 들어오는 것 작성
    public String boardWritePro(Board board) {
        // Board 클래스를 만들어 엔티티 형식 그대로 받음

        boardService.write(board);

        return "";
    }
}
