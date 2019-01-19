package com.hgcode.util.guava;

import com.google.common.base.Splitter;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SplitterDemo {
    public static void main(String[] args) {
        List<String> s=Splitter.on(",").splitToList("a,b,c,d,e,f");


        Map<String,String> map=Splitter.on("&").withKeyValueSeparator("=").split("name=wentao&pwd=123456");
        Iterator<Map.Entry<String,String>> iterator= map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key="+entry.getKey()+" value="+entry.getValue());
        }
    }
}
