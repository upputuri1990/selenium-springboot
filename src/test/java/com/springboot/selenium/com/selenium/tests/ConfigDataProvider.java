package com.springboot.selenium.com.selenium.tests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDataProvider {

   // Properties properties;
    //FileInputStream fileInputStream;

   /*
        public ConfigDataProvider() throws IOException {

        File src=new File("./resources/application.properties");
        try {
            fileInputStream = new FileInputStream(src);
            properties = new Properties();
            properties.load(fileInputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
*/
    @Value("${URL}")
    private String url;

    @Value("${chromePath}")
    private String chromePath;

    @Bean
    public String getApplicationURL(){

        return url;
    }

    @Bean
    public String getChromePath(){

        return chromePath;
    }









}
