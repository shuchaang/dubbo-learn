package com.example.cosumer.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author shuchang
 * Created on  2019-08-12
 */
@Slf4j
public class LoadBalanceSpi implements LoadBalance {

    @Override
    public <T> Invoker<T> select(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {
        System.out.println("my load balance-------------");
        for (Invoker<T> invoker : invokers) {
            System.out.println(invoker);
        }
        System.out.println("url---"+url);
        return invokers.get(invokers.size()-1);
    }
}
