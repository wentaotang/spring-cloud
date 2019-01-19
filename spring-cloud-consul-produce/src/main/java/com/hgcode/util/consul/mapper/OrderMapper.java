package com.hgcode.util.consul.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hgcode.util.consul.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
