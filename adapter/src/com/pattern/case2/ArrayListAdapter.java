package com.pattern.case2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListAdapter<T> implements Enumeration<T> {

    private Iterator<T> iterator;

    public ArrayListAdapter(ArrayList<T> arrayList) {
        this.iterator = arrayList.iterator();
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public T nextElement() {
        return iterator.next();
    }
}
