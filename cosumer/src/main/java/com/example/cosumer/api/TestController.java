package com.example.cosumer.api;

import api.ServiceAPI;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sun7ay
 * Created on  2019-01-19
 */
@RestController
public class TestController {

    @Reference(loadbalance = "mydemo")
    private ServiceAPI serviceAPI;


    @GetMapping("/a")
    public String test(){
        return serviceAPI.sendMessage("hahaaha");
    }
}
