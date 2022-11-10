package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {

    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public void goToWikiPage(){
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    public String getTitle(){
        return Driver.getDriver().getTitle();
    }

    @FindBy(id = "searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchBtn;

    @FindBy(tagName = "h1")
    public WebElement header;

    @FindBy(xpath = "//div[@class='fn']")
    public WebElement imageHeader;
}
