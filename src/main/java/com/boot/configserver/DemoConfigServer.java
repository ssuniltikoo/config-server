package com.boot.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DemoConfigServer {
    public static void main(String...args){
        SpringApplication.run(DemoConfigServer.class,args);
    }
}
