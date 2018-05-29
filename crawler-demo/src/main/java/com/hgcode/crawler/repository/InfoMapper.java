package com.hgcode.crawler.repository;

import com.hgcode.crawler.entity.InfoEntity;
import java.util.List;

public interface InfoMapper {

    List<InfoEntity> findByTitle(String title);

    long insert(InfoEntity entity);

    List<InfoEntity> find();
}
