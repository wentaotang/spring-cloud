package com.hgcode.util.consul.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "t_order")
public class Order extends BaseEntity {

    @TableField(value = "user_id")
    private Long userId;

    @TableField(value = "status")
    private Integer status;
}
