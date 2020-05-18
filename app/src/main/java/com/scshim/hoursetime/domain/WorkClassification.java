package com.scshim.hoursetime.domain;

/* 작업 분류 테이블 */
public class WorkClassification {
    //작업명. 청소, 빨래, 육아, 식사,  분리수거, 기타
    String name;

    public WorkClassification(String name) {
        this.name = name;
    }
}
