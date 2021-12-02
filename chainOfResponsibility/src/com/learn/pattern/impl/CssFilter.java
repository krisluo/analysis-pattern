package com.learn.pattern.impl;

import com.learn.pattern.Filter;
import com.learn.pattern.FilterChain;
import com.learn.pattern.Request;
import com.learn.pattern.Response;

public class CssFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        StringBuilder sb = new StringBuilder(request.getRequestStr());
        sb.append("----CssFilter处理");
        request.setRequestStr(sb.toString());
        response.setResponseStr(sb.toString());
        filterChain.doFilter(request, response);
    }
}
