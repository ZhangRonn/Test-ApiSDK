package com.zhang.testsdk;

import com.yupi.yuapiclientsdk.client.YuApiClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zhang")
public class TestController {

    @GetMapping("/weather")
    public Object getWeather() {
        String accessKey = "1cbf95e4189b4f9d98ca6e756560dfca";//用户自己的accessKey
        String secretKey = "08d0cb2de3ea9e7633706c29a94d71cd";//用户自己的secretKey
        YuApiClient tempClient = new YuApiClient(accessKey, secretKey);
        String weather = tempClient.getWeather(null);
        return weather;
    }
}
