package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {
    EtsyPage etsyPage = new EtsyPage();

    @Given("User is on https: www.etsy.com")
    public void user_is_on_https_www_etsy_com() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("User sees title is as expected.")
    public void user_sees_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Assert.assertEquals("Title verification is failed!", expectedTitle, Driver.getDriver().getTitle());
    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.searchBox.sendKeys("Wooden Spoon");
    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyPage.searchButton.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expectedTitle = "Wooden Spoon";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title verification is failed!", expectedTitle, actualTitle);
    }

    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String searchKeyword) {
        etsyPage.searchBox.sendKeys(searchKeyword);
    }

    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {
        Assert.assertEquals("Title verification is failed!", expectedTitle, Driver.getDriver().getTitle());
    }
}
