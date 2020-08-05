package com.example.Controller;

import com.example.Service.PickServiceImpl;
import com.example.mapper.PickMapper;
import com.example.pojo.Pick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Mr.X
 **/
//控制微信打卡小程序
@Controller
public class PickController {
@Autowired
    PickServiceImpl pickService;
    @RequestMapping("pick/Add")
    @ResponseBody
    public  String Add(Pick pick){
       return pickService.add(pick);
    }
}
