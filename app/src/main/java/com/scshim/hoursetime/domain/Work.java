package com.scshim.hoursetime.domain;


import lombok.Getter;
import lombok.Setter;

/* 작업 정보 테이블 */
@Getter
@Setter
public class Work {
    //작업 번호
    private int id;
    //작업할 날짜
    private int month;
    private int day;
    //작업명
    private String name;
    //작업점수
    private int score;
    //작업 완료 여부
    private boolean success = false;
    //작업자 이름
    private String worker = "";
    //작업 만족도. 1부터 5까지로 선택하며, 선 값을 화면에 별모양으로 표기한다.
    private int satisfaction = 0;
    public Work(String name, int score, int month, int day) {
        this.name = name;
        this.score = score;
        this.month = month;
        this.day = day;
    }
}
