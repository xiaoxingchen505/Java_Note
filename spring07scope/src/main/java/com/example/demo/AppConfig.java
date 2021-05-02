package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    //@Lazy
    public Notepad3 notepad3(){
        return new Notepad3();
    }
}
