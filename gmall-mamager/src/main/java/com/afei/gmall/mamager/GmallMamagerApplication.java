package com.afei.gmall.mamager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 消费者: 先扫描dubbo 然后 扫描spring
 * @author
 */
//@EnableDubboConfiguration
//@ImportResource(locations = {"classpath:dubbo-consumer.xml"})
//@ComponentScan(basePackages = "com.example.springbootclient.controller")
@SpringBootApplication
@ImportResource(value = {"classpath:consumer.xml"})
public class GmallMamagerApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(GmallMamagerApplication.class, args);
        Thread.sleep(Long.MAX_VALUE);
    }

}
