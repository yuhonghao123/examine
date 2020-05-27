package com.example.examine.controller;

import com.example.examine.pojo.DynamicPo;
import com.example.examine.pojo.Result;
import com.example.examine.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class DynamicController {

    @Autowired
    private DynamicService dynamicService;

    @RequestMapping("/dynamicList")
    @ResponseBody
    public Result dynamicList(){
        List<DynamicPo> dynamicPoList=dynamicService.getDynamicList();
        return Result.success(dynamicPoList);
    }

    @PostMapping("/getDetailsDynamic")
    @ResponseBody
    public Result getDetailsDynamic(@RequestBody Map<String, Object> dynamic){
        DynamicPo dynamicPo=dynamicService.getDetailsDynamic((Integer) dynamic.get("dynamicId"));
        return Result.success(dynamicPo);
    }
}
