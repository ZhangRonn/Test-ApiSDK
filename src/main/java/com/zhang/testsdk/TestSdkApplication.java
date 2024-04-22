package com.zhang.testsdk;

import com.alibaba.nacos.shaded.com.google.gson.Gson;
import com.yupi.yuapiclientsdk.client.YuApiClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSdkApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSdkApplication.class, args);
        System.out.println("项目启动成功啦！！！");
    }

}
