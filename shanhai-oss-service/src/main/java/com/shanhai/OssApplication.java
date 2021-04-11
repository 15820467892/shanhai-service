package com.shanhai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
//开启服务发现
@EnableDiscoveryClient
//开启Feign支持
@EnableFeignClients
@MapperScan("com.shanhai.dao")
public class OssApplication {

    public static void main(String [] args){

        SpringApplication.run(OssApplication.class,args);
    }



    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
