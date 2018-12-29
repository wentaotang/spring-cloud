package com.hgcode.consul.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "t_order")
public class Order {

    @TableId(type = IdType.ID_WORKER)
    private Long orderId;
    @TableField(value = "user_id")
    private Long userId;
    @TableField(value = "status")
    private Integer status;

}
