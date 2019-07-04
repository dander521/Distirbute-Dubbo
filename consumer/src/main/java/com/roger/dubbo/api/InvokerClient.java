package com.roger.dubbo.api;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class InvokerClient {

    @Reference(interfaceClass = com.roger.dubbo.api.ServerAPI.class)
    private ServerAPI serverAPI;

    public void testAdd(int a, int b) {
        System.out.println(serverAPI.addNum(a, b));
    }
}
