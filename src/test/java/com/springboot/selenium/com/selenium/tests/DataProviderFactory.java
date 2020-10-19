package com.springboot.selenium.com.selenium.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataProviderFactory {

    @Autowired
    ConfigDataProvider configDataProvider;

    @Bean
    public ConfigDataProvider getConfig(){

        return new ConfigDataProvider();
    }
}
