package com.afei.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@EnableDubbo
//@DubboComponentScan("com.afei.gmall.user.modules.sys.service.impl")
//注解中的报名一定要指定，当时配置的时候没有起作用，不知道是不是因为我application.properties文件中的key写错的了原因
// （这是我的配置 spring.dubbo.scan=com.rain.study.service.impl），这样写就好了@DubboComponentScan("com.rain.study.service.impl")服务也就添加进去了
@ImportResource("classpath:provider.xml")
public class GmallUserApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(GmallUserApplication.class, args);
        Thread.sleep(Long.MAX_VALUE);
    }

}
