package com.learn.pattern;

import com.learn.pattern.impl.*;

public class Application {

    public static void main(String[] args){
        ApplicationFilterConfig filterConfig = new ApplicationFilterConfig();
        Filter cssFilter = new CssFilter();
        Filter htmlFilter = new HtmlFilter();

        filterConfig.addFilter(cssFilter);
        filterConfig.addFilter(htmlFilter);

        Request request = new TestRequest();
        Response response = new TestResponse();
        FilterChain filterChain = new MyFilterChain(filterConfig);

        String message = "责任链模式测试";
        request.setRequestStr(message);

        filterChain.doFilter(request,response);
        System.out.print(response.getResponseStr());

    }
}
