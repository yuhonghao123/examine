package com.example.examine.service.impl;

import com.example.examine.dao.DynamicDao;
import com.example.examine.dao.UserDao;
import com.example.examine.pojo.DynamicPo;
import com.example.examine.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DynamicServiceImpl implements DynamicService {

    @Autowired
    private DynamicDao dynamicDao;

    @Autowired
    private UserDao userDao;

    @Override
    public List<DynamicPo> getDynamicList() {
        List<DynamicPo> dynamicPoList=dynamicDao.getAllDynamic();
        return dynamicPoList;
    }

    @Override
    public DynamicPo getDetailsDynamic(int dynamicId) {
        DynamicPo dynamicPo=dynamicDao.getByDynamicId(dynamicId);
        int userId=dynamicPo.getUserId();
        String username=userDao.getUserNameByUserId(userId);
        dynamicPo.setUsername(username);
        return dynamicPo;
    }
}
