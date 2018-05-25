package com.hgcode.order.consumer.hystrix;


import com.hgcode.order.consumer.client.OrderClient;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class OrderClientHystrix  implements OrderClient{

    @Override
    public String save(Map<String, Object> map) {
        return "保存失败";
    }
}
