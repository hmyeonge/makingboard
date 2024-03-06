package com.study.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

// JPA 를 사용해 데이터베이스 테이블과 매핑되는 도메인 객체를 정의
@Entity // 해당 클래스가 DB 의 테이블을 의미
@Data // Controller 에서 데이터를 끌어올 수 있도록 허용
public class Board {
    @Id                        //해당 필드가 테이블의 기본키 역할
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 값이 자동으로 생성됨
    private Integer id; // 엔티티의 고유 식별자 (데이터베이스 기본키)
    private String title; // 게시글 제목 저장 필드
    private String content; // 게시글 내용 저장 필드
};