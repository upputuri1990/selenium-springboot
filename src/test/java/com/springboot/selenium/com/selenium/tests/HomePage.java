package com.springboot.selenium.com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePage  {

    @Autowired
    public  WebDriver driver;

    HomePage(WebDriver Idriver){
        this.driver = Idriver;
        PageFactory.initElements(driver,this);

    }


    @FindBy(id="email")
    private WebElement email;

    @FindBy(id="pass")
    private WebElement pass;



    public void textEmail(String em){

        this.email.sendKeys(em);
    }

    public void textPassWord(String pwd){

        this.pass.sendKeys(pwd);
    }





}
