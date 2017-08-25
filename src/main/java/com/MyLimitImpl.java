package com;

import org.springframework.stereotype.Component;

/**
 * Created by akhil on 8/25/17.
 */
public class MyLimitImpl implements MyLimit {

    private int limit;

    public MyLimitImpl(int limit) {
        this.limit = limit;
    }

    @Override
    public int getLimit() {
        return 10;
    }
}
