package com.example.Service;

import com.example.mapper.PickMapper;
import com.example.pojo.Pick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mr.X
 **/
@Service
public class PickServiceImpl {
    @Autowired
    PickMapper pickMapper;

    public String add(Pick pick) {
        System.out.println(pick);
        //检索重复打卡
        int userid = pick.getUserid();
        pickMapper.insertSelective(pick);
        System.out.println("111111");
        return "success";
    }
}