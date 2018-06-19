package com.example.servicedemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 作者 E-mail:
 * @version 创建时间：${date} ${time}
 * 类说明
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    public  String hello()
    {
        return  "hello KinY ~KoKo";
    }
}
