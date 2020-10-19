package com.springboot.selenium.com.selenium.tests;


import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@SpringBootTest
public class HomePageTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private HomePage homePage;

    @Autowired
    private MainPage mainPage;

    @Autowired
    public WebDriver driver;


    @Test
    public void testHomepage() throws InterruptedException {
        mainPage.browserFactory.getBrowser();
        driver.manage().window().maximize();
        driver.get(mainPage.getURL());
        homePage.textEmail("241naveen.chowdary@gmail.com");
        homePage.textPassWord("Unaveen9#");


    }

    @Test
    public void testHomepage2() throws InterruptedException {
        mainPage.browserFactory.getBrowser();
        driver.manage().window().maximize();
        driver.get(mainPage.getURL());
        homePage.textEmail("241naveen.chowdary@gmail.com");
        homePage.textPassWord("Unaveen9#");

    }

    @AfterMethod
    public void testClose(){

        mainPage.closeBrowser();
    }



}
