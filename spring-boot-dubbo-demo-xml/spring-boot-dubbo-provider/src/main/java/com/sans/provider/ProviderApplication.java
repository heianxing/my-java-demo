package com.sans.provider;


//import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@ImportResource(locations = "classpath:config/dubbo-demo-provider.xml")
//@EnableDubbo //开启Dubbo的注解支持
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-provider.xml"});
//        context.start();
//        System.in.read();
        SpringApplication.run(ProviderApplication.class, args);
    }
}
