package com.shanhai.controller;

import com.shanhai.domain.Video;
import com.shanhai.domain.VideoOrder;
import com.shanhai.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 旭瑶&小滴课堂 xdclass.net
 * @Author 二当家小D  代码、笔记和技术指导联系我即可
 * @Version 1.0
 **/

@RestController
@RequestMapping("api/v1/video_order")
@RefreshScope
public class OrderController {


    @Value("${video.title}")
    private String videoTitle;

    @Autowired
    private VideoService videoService;

    @RequestMapping("save")
    public Object save(int videoId){

        //Video video = restTemplate.getForObject("http://localhost:9000/api/v1/video/find_by_id?videoId="+videoId, Video.class);

        //List<ServiceInstance> list =  discoveryClient.getInstances("xdclass-video-service");

        //ServiceInstance serviceInstance = list.get(0);

        //Video video = restTemplate.getForObject("http://xdclass-video-service/api/v1/video/find_by_id?videoId="+videoId, Video.class);

        Video video = videoService.findById(videoId);

        VideoOrder videoOrder = new VideoOrder();
        videoOrder.setVideoId(video.getId());
        videoOrder.setVideoTitle(video.getTitle());
        videoOrder.setCreateTime(new Date());
        videoOrder.setOutTradeNo(videoTitle);

        videoOrder.setServerInfo(video.getServeInfo());
        return videoOrder;

    }


    /**
     * 测试 feign 调用 使用post方式传输对象
     * @param video
     * @return
     */
//    @RequestMapping("save")
//    public Object save(@RequestBody Video video){
//
//       Integer rows =  videoService.save(video);
//
//       Map<String,Object> map  = new HashMap<>();
//
//       map.put("rows",rows);
//
//       return map;
//    }


    int temp = 0;

    @RequestMapping("list")
    public Object list(HttpServletRequest request){


//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        temp++;
        if(temp%3 == 0){
           // throw  new RuntimeException();
        }

        Map<String,String> map  = new HashMap<>();

        map.put("title1"," my 课程111");
        map.put("title2","my 课程222");
        map.put("port",request.getServerPort()+"");

        return map;
    }






}
