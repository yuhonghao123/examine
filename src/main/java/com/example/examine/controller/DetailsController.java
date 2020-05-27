package com.example.examine.controller;

import com.example.examine.pojo.DynamicPo;
import com.example.examine.pojo.Result;
import com.example.examine.pojo.UserPo;
import com.example.examine.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class DetailsController {

    @Autowired
    private DetailsService detailsService;

    @PostMapping("/updateDynamicType")
    @ResponseBody
    public Result updateDynamicType(@RequestBody Map<String, Object> dynamic) {
        DynamicPo dynamicPo=detailsService.updateDynamicType((String) dynamic.get("dynamic_type"),(Integer) dynamic.get("dynamicId"));
        return Result.success(dynamicPo);
    }
}
