package com.hgcode.message;

import com.hgcode.message.config.SysConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @Package com.hgcode.message
* @Description: 消息处理中心
* @author wentao_tang
* @date 2018/1/16 23:16
* @version V1.0
*/

@SpringBootApplication
@Controller
public class MessageApplication {

    @Autowired
    SysConfig sysConfig;

    public static void main(String[] args) {
        new SpringApplicationBuilder(MessageApplication.class).web(true).run(args);
    }

    @RequestMapping(value = "index")
    public void index(){
        System.out.println(sysConfig.getName());
        System.out.println(sysConfig.getPwd());
    }
}
