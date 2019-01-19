package com.hgcode.util.consul.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hgcode.util.consul.entity.Order;
import com.hgcode.util.consul.mapper.OrderMapper;
import com.hgcode.util.consul.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
