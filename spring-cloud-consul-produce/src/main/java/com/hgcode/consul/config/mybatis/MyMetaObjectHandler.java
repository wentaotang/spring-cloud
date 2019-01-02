package com.hgcode.consul.config.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

/**
 * 功能描述: 自动填充相关的属性 包括 新建时间，修改时间，修改人
 * @author: wentao_tang
 * @date: 2019-01-02 16:23
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    private static final Logger logger = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        logger.info("start insert fill ....");
        this.setFieldValByName("createTime", LocalDateTime.now(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        logger.info("start update fill ....");
        this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
    }
}
