package com.roger.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.roger.dubbo.api.ServerAPI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Service
@Component
@Slf4j
public class ServerAPIImpl implements ServerAPI {

    @Override
    public int addNum(int a, int b) {
        System.out.println("服务提供者获取数据为：" + a + "," + b);
        return a + b;
    }
}
