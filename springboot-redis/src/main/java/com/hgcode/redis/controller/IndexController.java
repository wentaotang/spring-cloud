package com.hgcode.redis.controller;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class IndexController {

    @Autowired
    private RedissonClient  redissonClient;

    @RequestMapping("/lock")
    public String test(){
        RLock rLock=redissonClient.getLock("r-lock");
        boolean lock=false;
        try{
            lock= rLock.tryLock(2000,1000, TimeUnit.SECONDS);
            if(lock){
                System.out.println("获取锁OK");
                Thread.sleep(5500);
            }else{
                System.out.println("获取锁失败");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(lock ){
                rLock.unlock();
                System.out.println("释放锁OK");
            }
        }

        return "success";
    }
}
