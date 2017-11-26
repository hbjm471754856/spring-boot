package com.example;

import com.example.util.SpringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        System.out.println("<<<<<<<<<<<<<<<<<<<<Spring Boot开始启动>>>>>>>>>>>>>>>>>>>>>");
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("<<<<<<<<<<<<<<<<<<<<Spring Boot启动成功>>>>>>>>>>>>>>>>>>>>>");
        DemoProperties demoProperties = SpringUtils.getBean("demoProperties");
        System.out.println("自定义属性文件获取值，username=" + demoProperties.getUsername());

    }


}
