package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiSearch_StepDef {
    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        wikiSearchPage.goToWikiPage();

    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikiSearchPage.searchBox.sendKeys("Steve Jobs");
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchBtn.click();
    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        Assert.assertTrue(wikiSearchPage.getTitle().contains("Steve Jobs"));
    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        wikiSearchPage.searchBox.sendKeys(string);
    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        Assert.assertTrue(wikiSearchPage.getTitle().contains(string));
    }
    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String string) {
        Assert.assertEquals(string, wikiSearchPage.header.getText());
    }

    @Then("User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String string) {
        Assert.assertEquals(string, wikiSearchPage.imageHeader.getText());
    }


}
