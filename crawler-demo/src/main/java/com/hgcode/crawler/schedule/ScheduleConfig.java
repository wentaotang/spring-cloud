package com.hgcode.crawler.schedule;

import com.hgcode.crawler.pageprocess.JiemianPageProcess;
import com.hgcode.crawler.pipline.MybatisPipleLine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Spider;

@Component
public class ScheduleConfig {

    private static Logger logger = LoggerFactory.getLogger(ScheduleConfig.class);

    @Autowired
    private MybatisPipleLine mybatisPipleLine;

    @Scheduled(cron="0 0/30 * * * ?")
    public void executeInfoScrapyTask() {
        logger.info("开始爬取界面新闻文章");
        // 间隔30分钟,执行任务
        Spider.create(new JiemianPageProcess())
                .addUrl("https://m.jiemian.com/lists/65.html")
                .addPipeline(mybatisPipleLine)
                //开启5个线程抓取
                .thread(2)
                //启动爬虫
                .run();
    }
}
