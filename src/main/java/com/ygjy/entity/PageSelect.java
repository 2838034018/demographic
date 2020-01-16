package com.ygjy.entity;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @ClassName: PageSelect
 * @Description: 分页查询增强类
 * @Author: yuyang
 * @Data: 2020/1/15 18:11
 * @Version: 1.0
 **/
public class PageSelect<T> extends PageInfo {
    public PageSelect(List<T> list,int i){
        super(list,i);
    }

    private String selCompanyName;
    private Integer pageNow;

    public String getSelCompanyName() {
        return selCompanyName;
    }

    public void setSelCompanyName(String selCompanyName) {
        this.selCompanyName = selCompanyName;
    }

    public Integer getPageNow() {
        return pageNow;
    }

    public void setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
    }
}
