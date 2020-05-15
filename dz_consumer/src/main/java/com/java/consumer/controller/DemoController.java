package com.java.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.java.commoms.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:djin
 * date:2020-05-08-11:55
 *   消费者控制器
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    //依赖注入提供者的业务层对象,订阅提供者的服务
    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/conTest")
    public @ResponseBody String conTest(String userName){
        try {
            return demoService.demoTest(userName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
