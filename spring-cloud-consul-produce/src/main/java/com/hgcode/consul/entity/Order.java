package com.hgcode.consul.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

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

    @TableField(fill = FieldFill.INSERT,value ="create_time")
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.UPDATE,value ="update_time")
    private LocalDateTime updateTime;

}
