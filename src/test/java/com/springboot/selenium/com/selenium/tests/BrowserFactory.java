package com.springboot.selenium.com.selenium.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class BrowserFactory {

    @Autowired
    DataProviderFactory dataProviderFactory;

    @Value("${browser}")
    private String browserName;

   /* @Autowired
    private WebDriver driver;

    @Bean
    public WebDriver getBrowser(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            //configDataProvider.getChromePath();
            System.setProperty("webdriver.chrome.driver", dataProviderFactory.getConfig().getChromePath());
           // WebDriverManager.chromedriver().browserVersion("86.0.4240.80").setup();
            driver = new ChromeDriver();
        }

        else if (browserName.equalsIgnoreCase("firefox")){

            //WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        else if (browserName.equalsIgnoreCase("IE")){
            //WebDriverManager.iedriver().setup();
            driver =new InternetExplorerDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       return  driver;
    }*/
    @Lazy
    @Bean
    public WebDriver getBrowser(){
        WebDriverManager.chromedriver().browserVersion("86.0.4240.80").setup();
        return new ChromeDriver();

    }





}
