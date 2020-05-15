package com.java.provider1.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.commoms.service.DemoService;

/**
 * author:djin
 * date:2020-05-08-11:08
 */
//@Service(version = "1.0.0")将此实现类注册到dubbo容器，由其进行管理，版本号必须写
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    //测试方法
    @Override
    public String demoTest(String userName) throws Exception {
        System.out.println("此时走的是provider1.."+userName);
        return userName;
    }
}
