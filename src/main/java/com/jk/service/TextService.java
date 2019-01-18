package com.jk.service;

import com.jk.bean.Region;

import java.util.List;

public interface TextService {
    List<Region> getAllRegion(Integer countryId);
}
