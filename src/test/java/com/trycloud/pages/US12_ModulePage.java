package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US12_ModulePage extends BasePage {

    public US12_ModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[5]/a/svg/image")
    public static WebElement talkModule;



    @FindBy(xpath = "//*[@id=\"contactsmenu\"]/div[1]")

    public WebElement contactsTryCloudQa;


    }

