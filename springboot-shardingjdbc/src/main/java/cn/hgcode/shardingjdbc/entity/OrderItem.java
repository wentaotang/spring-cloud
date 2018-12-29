package cn.hgcode.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/*@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor*/
@TableName(value = "order_item")
public class OrderItem {


    private Long orderItemId;
    private Long orderId;
    private Long userId;
    private Integer status;

}
