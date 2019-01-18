package com.jk.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.bean.Region;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryServiceImpl implements QueryService {


    @Reference
    TextService textService;

    @Override
    public List<Region> queryRegion(Integer countryId) {

        return textService.getAllRegion(countryId);
    }
}
