package com.springboot.selenium.com.selenium.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class MainPage {

    @Autowired
    public WebDriver driver;
    @Autowired
    public DataProviderFactory dataProviderFactory;
    @Autowired
    public BrowserFactory browserFactory;

    @PostConstruct
    private void init() {
       PageFactory.initElements(this.driver, this);
   }

   @Bean
   public String getURL(){

        return browserFactory.dataProviderFactory.getConfig().getApplicationURL();

   }


    public  void closeBrowser(){

        driver.close();
    }





}
