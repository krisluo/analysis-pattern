package com.pattern.case2;

import java.util.ArrayList;
import java.util.Enumeration;

public class ArrayListTest {

    public static void main(String[] args){

        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");

        testEnumeration(new ArrayListAdapter<>(strings));
    }

    private static void  testEnumeration(Enumeration enumeration){
        while (enumeration.hasMoreElements()){
            Object obj = enumeration.nextElement();
            System.out.println(obj);
        }
    }
}
