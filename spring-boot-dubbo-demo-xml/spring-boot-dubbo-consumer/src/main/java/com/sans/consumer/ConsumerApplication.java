package com.sans.consumer;

//import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

//@EnableDubbo //开启dubbo的注解支持
@ImportResource(locations = "classpath:config/dubbo-demo-consumer.xml")
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) throws IOException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/dubbo-demo-consumer.xml"});
//        context.start();
//        System.in.read();
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
