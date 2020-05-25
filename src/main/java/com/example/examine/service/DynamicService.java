package com.example.examine.service;

import com.example.examine.pojo.DynamicPo;

import java.util.List;

public interface DynamicService {

    List<DynamicPo> getDynamicList();

    DynamicPo getDetailsDynamic(int dynamicId);
}
