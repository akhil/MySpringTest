package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by akhil on 8/25/17.
 */
@Component
public class MyMain {

    private int limit;

    @Autowired
    public MyMain(MyLimit limit) {
        this.limit = limit.getLimit();
    }

    public String upCase(String s) {
        return s.length() > limit ?
                s.substring(0, limit - 1).toUpperCase() :
                s.toUpperCase();
    }
}