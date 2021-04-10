package com.shanhai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@MapperScan("com.shanhai.dao")
@EnableDiscoveryClient
public class VulnApplication {

    public static void main(String [] args){

        SpringApplication.run(VulnApplication.class,args);
    }


}
