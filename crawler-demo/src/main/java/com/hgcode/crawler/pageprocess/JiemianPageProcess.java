package com.hgcode.crawler.pageprocess;

import com.hgcode.crawler.entity.InfoEntity;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Selectable;
import us.codecraft.xsoup.Xsoup;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
* @description: 界面新闻爬取配置
* @author wentao_tang
* @date 2018/5/5 10:26
* @version v1.0
*/

@Component
public class JiemianPageProcess implements PageProcessor {

    private Site site = Site.me().setDomain("m.jiemian.com").setRetryTimes(3).setSleepTime(1000);

    @Override
    public void process(Page page) {

        Selectable selectable =page.getHtml().xpath("//div[@class='news-list']");


        List<String> children=selectable.xpath("//div[@class='news-view left']").all();

        List<InfoEntity> list=new ArrayList<>(20);

        for(String temp: children){
            Document document = Jsoup.parse(temp);

            //获取文章链接
            String url = Xsoup.compile("//div[@class='news-header']//a/@href").evaluate(document).get();
            //获取文章图片 有可能没有
            String imageUrl = Xsoup.compile("//img/@src").evaluate(document).get();
            //标题
            String title = Xsoup.compile("//div[@class='news-header']//a/text()").evaluate(document).get();
            //文章来源 有可能为没有
            String source = Xsoup.compile("//div[@class='news-footer']//a/text()").evaluate(document).get();

            InfoEntity infoEntity=new InfoEntity();
            infoEntity.setCreateTime(new Date());
            infoEntity.setImageUrl(imageUrl);
            infoEntity.setUrl(url);
            infoEntity.setTitle(title);
            infoEntity.setSource(source);
            infoEntity.setScrapySource("界面新闻");


            list.add(infoEntity);
            page.putField("items",list);
        }



    }

    @Override
    public Site getSite() {
        return site;
    }
}
