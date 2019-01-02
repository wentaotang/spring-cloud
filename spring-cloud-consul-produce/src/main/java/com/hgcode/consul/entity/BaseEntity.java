package com.hgcode.consul.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseEntity {

    @TableId(type = IdType.ID_WORKER,value = "id")
    private Long id;

    @TableField(fill = FieldFill.INSERT,value ="create_time")
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.UPDATE,value ="update_time")
    private LocalDateTime updateTime;

    @Version
    @TableField(value ="version")
    private Integer version;

    @TableField(value ="create_by")
    private String createBy;

    @TableField(value ="update_by")
    private String updateBy;
}
