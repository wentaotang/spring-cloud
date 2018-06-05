package com.hgcode.order.consumer.hystrix;


import com.hgcode.order.consumer.client.OrderClient;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class OrderClientHystrix  implements OrderClient{

    @Override
    public Map<String,Object> save(Map<String, Object> map) {
        return null;
    }
}
