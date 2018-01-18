package com.hgcode.message.vo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class MemberMessage implements Serializable{

    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "MemberMessage{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
