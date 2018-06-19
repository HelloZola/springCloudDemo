package com.example.conusmerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 作者 E-mail:
 * @version 创建时间：${date} ${time}
 * 类说明
 */
@RestController
public class HelloController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/")
    public  String hello()
    {
        return  restTemplate.getForEntity("http://service-demo/",String.class).getBody();
    }
}
