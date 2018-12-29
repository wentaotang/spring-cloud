package cn.hgcode.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/*@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor*/
@TableName(value = "order")
public class Order {

    private Long orderId;
    private Long userId;
    private Integer status;

}
