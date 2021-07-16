package com.shanhai.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("demo")
    public Object list(HttpServletRequest request) throws UnknownHostException {
        Map<String,String> map  = new HashMap<>();

        InetAddress ia= InetAddress.getLocalHost();
//        String localname=ia.getHostName();
        String localip=ia.getHostAddress();

        map.put("title1"," hello,world 1");
        map.put("title2","hello,world 2");
        map.put("ip",localip+"");
        map.put("port",request.getServerPort()+"");

        return map;

    }
}
