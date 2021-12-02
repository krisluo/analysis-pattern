package com.learn.pattern.impl;

import com.learn.pattern.Filter;
import com.learn.pattern.FilterChain;
import com.learn.pattern.Request;
import com.learn.pattern.Response;

import java.util.List;

public class MyFilterChain implements FilterChain {

    private int index = 0;

    private final ApplicationFilterConfig filterConfig;

    public MyFilterChain(ApplicationFilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(Request request, Response response) {
        List<Filter> filters = filterConfig.getFilters();
        if (filters.size() > index){
            Filter filter = filters.get(index);
            index++;
            filter.doFilter(request,response,this);
        }
    }
}
