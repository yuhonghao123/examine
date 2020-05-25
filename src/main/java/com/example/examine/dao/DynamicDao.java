package com.example.examine.dao;

import com.example.examine.pojo.DynamicPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DynamicDao {

    @Select("select dynamic_id,title,thumbnail_id,content,dynamic_type,user_id,tag,time from dynamic")
    List<DynamicPo> getAllDynamic();

    @Select("select dynamic_id,title,thumbnail_id,content,dynamic_type,user_id,tag,time from dynamic where dynamic_id=#{dynamicId}")
    DynamicPo getByDynamicId(int dynamicId);

}
