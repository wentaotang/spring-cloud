package com.hgcode.crawler.entity;

import java.util.Date;

public class InfoEntity {

    private Long id;

    private Date createTime;
    /**
     * 标题
     */
    private String title;
    /**
     * 新闻来源
     */
    private String source;
    /**
     *
     */
    private String scrapySource;
    /**
     * 新闻链接
     */
    private String url;
    /**
     * 新闻图标
     */
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getScrapySource() {
        return scrapySource;
    }

    public void setScrapySource(String scrapySource) {
        this.scrapySource = scrapySource;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
