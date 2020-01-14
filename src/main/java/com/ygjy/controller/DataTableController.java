package com.ygjy.controller;

import com.ygjy.entity.DictionaryTable;
import com.ygjy.entity.Region;
import com.ygjy.service.DictionaryTableService;
import com.ygjy.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("dataTable")
public class DataTableController {
    @Autowired
    private RegionService regionService;
    @Autowired
    private DictionaryTableService dictionaryTableService;

    //查询所有省
    @RequestMapping("shen")
    @ResponseBody
    public List<Region> shen() {
        List<Region> byProvince = regionService.findByProvince();
        return byProvince;
    }

    //除了省都查
    @RequestMapping("all")
    @ResponseBody
    public List<Region> shi(String superiormumber) {
        List<Region> by = regionService.findBy(superiormumber);
        return by;
    }

    //查询居住方式
    @RequestMapping("livingType")
    @ResponseBody
    public List<DictionaryTable> livingType() {
        List<DictionaryTable> livingType = dictionaryTableService.livingType();
        return livingType;
    }

    //查询居住事由
    @RequestMapping("liveFor")
    @ResponseBody
    public List<DictionaryTable> liveFor() {
        List<DictionaryTable> liveFor = dictionaryTableService.liveFor();
        return liveFor;
    }
    /**
     * @Author yuyang
     * @Description //根据 parentId获取字典表信息
     * @Date 11:17 2020/1/14
     * @param parentId
     * @return java.util.List<com.ygjy.entity.DictionaryTable>
     **/
    @RequestMapping("/dictionaryTableList")
    @ResponseBody
    public List<DictionaryTable> getDictionaryTableList(String parentId){
        List<DictionaryTable> dictionaryTableList = dictionaryTableService.getDictionaryTableList(parentId);
        return dictionaryTableList;
    }
}
