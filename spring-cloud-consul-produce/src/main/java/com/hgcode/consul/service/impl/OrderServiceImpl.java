package com.hgcode.consul.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hgcode.consul.entity.Order;
import com.hgcode.consul.mapper.OrderMapper;
import com.hgcode.consul.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService   {

}
