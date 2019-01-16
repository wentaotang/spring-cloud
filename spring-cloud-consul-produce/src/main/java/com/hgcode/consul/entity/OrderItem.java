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
@TableName(value = "t_order_item")
public class OrderItem  extends BaseEntity{


    @TableField(value = "order_id")
    private Long orderId;
    @TableField(value = "user_id")
    private Long userId;
    @TableField(value = "status")
    private Integer status;

}
