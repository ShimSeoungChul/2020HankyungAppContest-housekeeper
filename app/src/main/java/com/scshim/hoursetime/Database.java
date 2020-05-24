package com.scshim.hoursetime;

import com.scshim.hoursetime.domain.Work;

import java.util.ArrayList;
import java.util.List;

public class Database {

    static List<Work> minwoo;
    static List<Work> jihyun;

    void Database(){
        minwoo = new ArrayList<>();
        jihyun = new ArrayList<>();
        minwoo.add(new Work("빨래",2,5,24));
        minwoo.add(new Work("청소",3,5,24));
        minwoo.add(new Work("육아",5,5,25));

        //minwoo.stream().forEach(i->)
    }

}
