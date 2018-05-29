package com.hgcode.crawler.pipline;

import com.hgcode.crawler.entity.InfoEntity;
import com.hgcode.crawler.repository.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.List;

@Component
public class MybatisPipleLine implements Pipeline {

    @Autowired
    private InfoMapper infoMapper;


    @Override
    public void process(ResultItems resultItems, Task task) {
        List<InfoEntity> list= resultItems.get("items");
        for(InfoEntity model: list){
           List<InfoEntity> tempList=infoMapper.findByTitle(model.getTitle());
           if(tempList ==null ||  tempList.isEmpty()) {
               infoMapper.insert(model);
           }
        }

    }

}



