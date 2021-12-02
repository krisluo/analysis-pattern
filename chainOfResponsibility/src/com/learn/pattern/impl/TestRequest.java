package com.learn.pattern.impl;

import com.learn.pattern.Request;

public class TestRequest implements Request {
    private String requestStr;

    @Override
    public String getRequestStr() {
        return requestStr;
    }

    @Override
    public void setRequestStr(String requestStr) {
        this.requestStr = requestStr;
    }
}
