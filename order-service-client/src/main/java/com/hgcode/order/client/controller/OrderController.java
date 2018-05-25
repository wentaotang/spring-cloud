package com.hgcode.order.client.controller;

import com.hgcode.order.client.vo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@RestController
public class OrderController {

    @RequestMapping("/save")
    public String save(@RequestBody Map<String,Object> map) throws InvocationTargetException, IllegalAccessException {
        User user=new User();
        BeanUtils.copyProperties(user,map);
        System.out.println(user);
        return "ok";
    }


}
