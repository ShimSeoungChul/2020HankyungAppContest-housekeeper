package com.scshim.hoursetime;

import com.scshim.hoursetime.domain.Work;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static String userName = "지현";

    public static List<Work> minwoo;
    public static List<Work> jihyun;
    public static List<Work> remainingWork;

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
