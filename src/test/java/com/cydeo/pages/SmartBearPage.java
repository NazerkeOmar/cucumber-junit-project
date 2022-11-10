package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearPage {
    public SmartBearPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement username;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement password;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement order;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement product;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement name;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipcode;

    @FindBy (xpath = "//input[@type='radio']")
    public List<WebElement> cardTypes;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement cardTypeVisa;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expirationDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement process;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement viewAllOrders;

    @FindBy(xpath = "//table[@class='SampleTable']//td[.='John Wick']")
    public WebElement JohnWick;

    public void loginToSmartBear(){
        username.sendKeys("Tester");
        password.sendKeys("test" + Keys.ENTER);
    }

}
