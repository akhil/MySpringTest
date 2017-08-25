package com;

import org.springframework.stereotype.Component;

/**
 * Created by akhil on 8/25/17.
 */
@Component
public class MyLimit2 implements MyLimit {

    @Override
    public int getLimit() {
        return 10;
    }
}
