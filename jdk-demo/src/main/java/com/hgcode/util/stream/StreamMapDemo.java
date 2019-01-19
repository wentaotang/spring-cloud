package com.hgcode.util.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMapDemo {

    //A List of Strings to Uppercase
    public void converStringUpcase() {
        List<String> alphaList = Arrays.asList("a", "b", "c", "d");
        alphaList.stream().map(String::toUpperCase).collect(Collectors.toList());
        alphaList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
    }

    //List of objects -> List of String
    public void conver() {
        List<User> userList = new ArrayList<>();
        //获取列表中的ID，并返回ID字符串串
        String str = userList.stream().map(User::getId).collect(Collectors.toList()).stream().map(w -> w.toString()).collect(Collectors.joining(","));
        //获取列表中的ID，并返回ID列表
        List<Integer> collect = userList.stream().map(x -> x.getId()).collect(Collectors.toList());
        //获取列表中的ID，并返回ID字符串串
        String strList = userList.stream().map(x -> x.getId()).collect(Collectors.toList()).stream().map(w -> w.toString()).collect(Collectors.joining(","));
    }


    public static void main(String[] args) {
        List<User> list=new ArrayList<>();
        User user1=new User(1,"wentao");
        User user2=new User(1,"wentao");
        User user3=new User(1,"wentao");
        User user4=new User(1,"wentao");
        User user5=new User(1,"wentao");
        User user6=new User(1,"wentao");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        /*list.stream().forEach(x->x.setId(6));
        for(User user: list){
            System.out.println(user.getId());
        }*/

        //List<String> list=Arrays.asList("1","2","3","2","3","1");
        List<User> tmep=list.stream().filter(distinctByKey(o -> o.getId())).collect(Collectors.toList());
        System.out.println(tmep.size());

    }



    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;

    }


        static class User {
        private Integer id;
        private String name;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public User(Integer id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
