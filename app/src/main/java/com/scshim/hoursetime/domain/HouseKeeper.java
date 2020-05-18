package com.scshim.hoursetime.domain;

/* 가사도우미 정보  테이블 */
public class HouseKeeper {
    //가사도우미 이름
    String name;
    //별점
    int star;
    //주소
    String addr;
    //전화번호
    String phone;

    public HouseKeeper(String name, int star, String addr, String phone) {
        this.name = name;
        this.star = star;
        this.addr = addr;
        this.phone = phone;
    }
}
