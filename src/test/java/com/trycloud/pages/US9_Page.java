package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US9_Page {
    public US9_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Dashboard']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
//    public WebElement dashboardPage; //

    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement fileModules;

    @FindBy(xpath = "//a[@class='icon icon-more']")
    public WebElement actionIcon;
    //(//span[@class='icon icon-more'])[1]
    //(//a[@class='action action-menu permanent'])[1]

    @FindBy(xpath = "a[@class='menuitem action action-details permanent']")
    public WebElement detailOptions;
    //a[@class='menuitem action action-details permanent']
    //li[@class=' action-details-container']


    @FindBy(xpath ="//span[@class='app-sidebar-tabs__tab-icon icon-comment']" )
    public WebElement postMessage;


    @FindBy(xpath = "//div[@contenteditable='true']")
    public WebElement message;


    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement submitButton;
}
