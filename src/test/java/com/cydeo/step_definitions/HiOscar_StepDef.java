package com.cydeo.step_definitions;

import com.cydeo.pages.HiOscarPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class HiOscar_StepDef {
    HiOscarPage hiOscarPage = new HiOscarPage();

    @Given("Go to hiOscar web page")
    public void go_to_https_www_hioscar_com_care_options() {
        Driver.getDriver().get("https://www.hioscar.com/care-options");
    }

    @When("Click Search network")
    public void click_search_network() {
        hiOscarPage.searchNetworkBtn.click();
    }

    @When("From Coverage year dropdown Select {string} option")
    public void from_coverage_year_dropdown_select_option(String year) {
        BrowserUtils.waitForVisibilityOf(hiOscarPage.coverageYear);
        hiOscarPage.coverageYear.click();
        hiOscarPage.selectOption(year);
    }

    @When("From Coverage access dropdown Select {string} option")
    public void from_coverage_access_dropdown_select_employer_provided_option(String access) {
        hiOscarPage.coverageAccess.click();
        hiOscarPage.selectOption(access);
    }

    @When("From Network partner dropdown Select {string} option")
    public void from_network_partner_dropdown_select_oscar_option(String partner) {
        hiOscarPage.networkPartner.click();
        hiOscarPage.selectOption(partner);
    }

    @When("From Coverage area dropdown Select {string}")
    public void from_coverage_area_dropdown_select_new_jersey(String area){
        hiOscarPage.coverageArea.click();
        hiOscarPage.selectOption(area);
    }

    @When("Click Continue button")
    public void click_continue_button() {
        hiOscarPage.continueBtn.click();
    }

    @Then("Verify title contains “{string}”")
    public void verifyTitleContains(String title) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }
}
