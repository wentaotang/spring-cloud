package com.hgcode.util.consul.web;

import com.google.common.collect.Lists;
import com.hgcode.util.consul.entity.Order;
import com.hgcode.util.consul.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/sharding")
public class ShardingController {

    @Resource
    private OrderService orderService;

    @GetMapping("/batch/add")
    public void batchAdd(){
        List<Order> list= Lists.newArrayList();
        for(int i=0;i<5;i++){
            Order order=new Order();
            order.setStatus(0);
            order.setUserId(5L);
            list.add(order);
        }
        orderService.saveBatch(list);
    }

    @GetMapping("/getById")
    public Order getById(@RequestParam("id")Long id){
        return orderService.getById(id);
    }
}
