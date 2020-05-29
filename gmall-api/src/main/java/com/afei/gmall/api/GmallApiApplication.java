package com.afei.gmall.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ImportResource(value = {"classpath:consumer.xml"})
public class GmallApiApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(GmallApiApplication.class, args);
    }

}
