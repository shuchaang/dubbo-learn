package com.sc.producer.api;

import api.ServiceAPI;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author sun7ay
 * Created on  2019-01-19
 */
@Component
@Service
public class ServiceAPIImpl implements ServiceAPI {
    @Override
    public String sendMessage(String msg) {
        System.out.println("aaaaaa");
        return "default impl for service api="+msg;
    }
}
