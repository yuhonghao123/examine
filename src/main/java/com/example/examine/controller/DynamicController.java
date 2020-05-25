package com.example.examine.controller;

import com.example.examine.pojo.DynamicPo;
import com.example.examine.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DynamicController {

    @Autowired
    private DynamicService dynamicService;

    @RequestMapping("/dynamicList")
    @ResponseBody
    public List<DynamicPo> dynamicList(){
        List<DynamicPo> dynamicPoList=dynamicService.getDynamicList();
        return dynamicPoList;
    }

    @PostMapping("/getDetailsDynamic")
    @ResponseBody
    public DynamicPo getDetailsDynamic(@RequestParam(value = "dynamicId", defaultValue = "0") int dynamicId){
        DynamicPo dynamicPo=dynamicService.getDetailsDynamic(dynamicId);
        return dynamicPo;
    }
}
