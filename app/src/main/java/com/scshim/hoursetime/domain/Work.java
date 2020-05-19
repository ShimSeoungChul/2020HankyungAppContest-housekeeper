package com.scshim.hoursetime.domain;

/* 작업 정보 테이블 */
public class Work {
    //시작 시간
    int startMonth;
    int startDay;
    int startHour;
    int startMinute;

    //종료 시간
    int endMonth;
    int endDay;
    int endHour;
    int endMinute;

    //작업명
    String name;
    //작업점수
    int score;

    //작업 완료 여부
    boolean success = false;
    //작업자 이름
    String worker명 = "";
    //작업 만족도. 1부터 5까지로 선택하며, 선택 값을 화면에 별로 표기한다.
    int start = 0;


    public Work(int startMonth, int startDay, int startHour, int startMinute, int endMonth, int endDay, int endHour, int endMinute, String name, int score) {
        this.startMonth = startMonth;
        this.startDay = startDay;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endMonth = endMonth;
        this.endDay = endDay;
        this.endHour = endHour;
        this.endMinute = endMinute;
        this.name = name;
        this.score = score;
    }
}
