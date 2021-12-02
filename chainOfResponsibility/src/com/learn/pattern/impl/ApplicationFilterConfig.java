package com.learn.pattern.impl;

import com.learn.pattern.Filter;

import java.util.ArrayList;
import java.util.List;

public class ApplicationFilterConfig {

    private List<Filter> filters = new ArrayList<>();

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public List<Filter> getFilters() {
        return filters;
    }
}
