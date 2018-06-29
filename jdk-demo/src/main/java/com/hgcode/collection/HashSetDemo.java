package com.hgcode.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("a");
        set.add("b");

        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
