package com.learn.pattern.impl;

import com.learn.pattern.Response;

public class TestResponse implements Response {
    private String responseStr;

    @Override
    public String getResponseStr() {
        return responseStr;
    }

    @Override
    public void setResponseStr(String responseStr) {
        this.responseStr = responseStr;
    }
}
