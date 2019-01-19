package com.hgcode.guava;

import com.google.common.base.Joiner;


public class JoinDemo {

    public static void main(String[] args) {
        String s=Joiner.on(",").skipNulls().join("a","b","c");
        System.out.println(s);
    }
}
