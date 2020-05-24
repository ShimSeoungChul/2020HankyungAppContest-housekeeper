package com.scshim.hoursetime.domain;

import java.util.List;

/* 작업 정보 테이블 */
public class Work {
    //작업 번호
    int id;

    //작업할 날짜
    int month;
    int day;

    //작업명
    String name;
    //작업점수
    int score;

    //작업 완료 여부
    boolean success = false;
    //작업자 이름
    String worker명 = "";
    //작업 만족도. 1부터 5까지로 선택하며, 선 값을 화면에 별모양으로 표기한다.
    int start = 0;

    public Work(String name, int score, int month, int day) {
        this.name = name;
        this.score = score;
        this.month = month;
        this.day = day;
    }
}
