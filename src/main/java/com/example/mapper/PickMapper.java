package com.example.mapper;

import com.example.pojo.Pick;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface PickMapper {
    int deleteByPrimaryKey(Integer pickid);

    int insert(Pick record);

    int insertSelective(Pick record);

    Pick selectByPrimaryKey(Integer pickid);

    int updateByPrimaryKeySelective(Pick record);

    int updateByPrimaryKey(Pick record);
}