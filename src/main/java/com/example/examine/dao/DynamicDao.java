package com.example.examine.dao;

import com.example.examine.pojo.DynamicPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface DynamicDao {

    @Select("select dynamicId,title,thumbnailId,content,dynamic_type,userId,tag,time from dynamic")
    List<DynamicPo> getAllDynamic();

    @Select("select dynamicId,title,thumbnailId,content,dynamic_type,userId,tag,time from dynamic where dynamicId=#{dynamicId}")
    DynamicPo getByDynamicId(int dynamicId);

    @Update("UPDATE dynamic SET dynamic_type = #{dynamic_type} WHERE dynamicId =#{dynamicId}")
    void UpdateDynamic_type(String dynamic_type,int dynamicId);

}
