package com.hgcode.util.consul.config.mybatis;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan(value = {"com.hgcode.consule.mapper"})
@EnableTransactionManagement
public class MybatisPlusConfig {

    /**
     * 性能插件 配置化启用，在开发环境不建议使用
     */
    @Bean
    @Profile(value = {"test","dev"})
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor= new PerformanceInterceptor();
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
    }
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    /**
     * 乐观锁 插件
     * @return
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }
}
