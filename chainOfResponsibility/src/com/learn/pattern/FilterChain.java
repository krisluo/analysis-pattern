package com.learn.pattern;

public interface FilterChain {
    void doFilter(Request request, Response response);
}
