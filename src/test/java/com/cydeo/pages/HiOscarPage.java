package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HiOscarPage {
    public HiOscarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[.='Search network']")
    public WebElement searchNetworkBtn;

    @FindBy (xpath = "//label[@for='unnamed-20']")
    public WebElement coverageYear;

    @FindBy(xpath = "//label[@for='unnamed-22']")
    public WebElement coverageAccess;

    @FindBy(xpath = "//label[@for='unnamed-24']")
    public WebElement networkPartner;

    @FindBy(xpath = "//label[@for='unnamed-26']")
    public WebElement coverageArea;

    @FindBy(xpath = "//button[.='Continue']")
    public WebElement continueBtn;

    @FindBy(xpath = "//li[@class='DropdownOverlayItem_unselectable__Pa5zw']")
    public List<WebElement> listOfOptions;

    public void selectOption(String option){
        BrowserUtils.waitForVisibilityOfAllElements(listOfOptions);
        for(WebElement each: listOfOptions){
            if(each.getText().equals(option)){
                each.click();
                break;
            }
        }
    }
}
