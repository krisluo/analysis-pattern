package com.learn.pattern;

public interface Filter {
    void doFilter(Request request,Response response,FilterChain filterChain);
}
