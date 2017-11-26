package com.example;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//该类为spring容器组建
@Component
//编译时运行加载该类，约束application.properties文件中的属性
@ConfigurationProperties(prefix = "com.example")
public class DemoProperties {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
