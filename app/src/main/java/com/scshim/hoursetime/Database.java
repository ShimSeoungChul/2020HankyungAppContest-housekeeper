package com.scshim.hoursetime;

import com.scshim.hoursetime.domain.Work;

import java.util.ArrayList;
import java.util.List;

public class Database {

    static String userName = "지현";

    static List<Work> minwoo;
    static List<Work> jihyun;
    static List<Work> remainingWork;

    void Database(){
        minwoo = new ArrayList<>();
        jihyun = new ArrayList<>();
        //민우 플레이어의 더미데이터 삽입
        minwoo.add(new Work("빨래",2,5,24));
        minwoo.add(new Work("청소",3,5,24));
        minwoo.add(new Work("육아",5,5,25));

        for (Work work:minwoo) {
            work.setSuccess(true);
            work.setWorker("민우");
        }
    }

}
