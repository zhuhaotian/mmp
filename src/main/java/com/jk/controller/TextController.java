package com.jk.controller;

import com.jk.bean.Region;
import com.jk.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("location")
public class TextController {
    @Autowired
    QueryService queryService;

    @RequestMapping("getRegion")
    public List<Region> getRegion(Integer countryId) {

        System.out.println(countryId);

        //dubbo 可以像调用本地方法一样调用远程方法
        return queryService.queryRegion(countryId);
    }
}
