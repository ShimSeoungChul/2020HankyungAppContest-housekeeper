package com.scshim.hoursetime;

import com.scshim.hoursetime.domain.Work;

import java.util.ArrayList;
import java.util.List;

 public class Database {

    public static String userName = "지현";

    public static List<Work> minwoo;
    public static List<Work> jihyun;
    public static List<Work> remainingWork;
    public static int jhChange = 0;

     static public void init(){
        minwoo = new ArrayList<>();
        jihyun = new ArrayList<>();
        remainingWork = new ArrayList<>();
        //민우 플레이어의 더미데이터 삽입
        minwoo.add(new Work("빨래",2,5,24));
        minwoo.add(new Work("청소",3,5,24));
        minwoo.add(new Work("육아",5,5,25));
        minwoo.add(new Work("설거지",5,5,22));
        minwoo.add(new Work("기타",2,5,20));


        jihyun.add(new Work("육아",5,5,22));
        jihyun.add(new Work("빨래",5,5,21));
        jihyun.add(new Work("청소",5,5,23));
        jihyun.add(new Work("기타",5,5,22));
        jihyun.add(new Work("설거지",5,5,22));


         for (Work work:minwoo) {
            work.setSuccess(true);
            work.setWorker("민우");
        }

         remainingWork.add(new Work("빨래",2,5,26));
         remainingWork.add(new Work("청소",4,5,26));
         remainingWork.add(new Work("육아",5,5,26));
         remainingWork.add(new Work("육아",2,5,27));
         remainingWork.add(new Work("청소",2,5,27));
         remainingWork.add(new Work("빨래",2,5,27));
         remainingWork.add(new Work("빨래",2,5,28));
         remainingWork.add(new Work("에어컨필터청소",2,5,28));
         remainingWork.add(new Work("빨래",2,5,28));
         remainingWork.add(new Work("빨래",2,5,29));
         remainingWork.add(new Work("빨래",2,5,29));
         remainingWork.add(new Work("분리수거",2,5,29));

    }

}
