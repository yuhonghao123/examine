package com.example.examine.service.impl;

import com.example.examine.dao.DynamicDao;
import com.example.examine.dao.UserDao;
import com.example.examine.pojo.DynamicPo;
import com.example.examine.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailsServiceImpl implements DetailsService {

    @Autowired
    private DynamicDao dynamicDao;

    @Autowired
    private UserDao userDao;

    @Override
    public DynamicPo updateDynamicType(String dynamic_type, int dynamicId) {
        dynamicDao.UpdateDynamic_type(dynamic_type,dynamicId);
        DynamicPo dynamicPo=dynamicDao.getByDynamicId(dynamicId);
        int userId=dynamicPo.getUserId();
        String username=userDao.getUserNameByUserId(userId);
        dynamicPo.setUsername(username);
        return dynamicPo;
    }
}
