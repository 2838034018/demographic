package com.ygjy.controller;

import com.ygjy.entity.Region;
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

    @RequestMapping("shen")
    @ResponseBody
    public List<Region> shen() {
        List<Region> byProvince = regionService.findByProvince();
        return byProvince;
    }

    @RequestMapping("all")
    @ResponseBody
    public List<Region> shi(String id) {
        List<Region> by = regionService.findBy(id);
        return by;
    }
}
