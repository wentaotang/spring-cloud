package com.hgcode.util.order.client.controller;

import com.hgcode.util.order.client.exception.CustomerException;
import com.hgcode.util.order.client.vo.User;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderController {

    @RequestMapping("/save")
    public Map<String,Object> save(@RequestBody Map<String,Object> map)  {
        User user=new User();
        BeanUtils.copyProperties(user,map);
        System.out.println(user);
        Map<String,Object> resp=new HashMap<>();
        resp.put("code",400);
        resp.put("message","陈工");
        if(true){
            throw new CustomerException(400,"全局异常");
        }
        return resp;
    }


}
