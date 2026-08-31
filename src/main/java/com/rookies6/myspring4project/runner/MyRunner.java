package com.rookies6.myspring4project.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner{

    @Value("${spring.application.name}")
    String applicationName;
    @Override
    public void run(ApplicationArguments args)throws Exception{
        System.out.println("에러 호출됨");
        System.out.println("Application Name"+ applicationName);

        args.getOptionNames().forEach(name -> System.out.println("name = " + name));

    }
}
