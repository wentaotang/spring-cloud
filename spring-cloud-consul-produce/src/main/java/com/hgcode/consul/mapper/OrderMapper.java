package com.hgcode.consul.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hgcode.consul.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
