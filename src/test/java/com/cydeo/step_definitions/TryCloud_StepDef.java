package com.cydeo.step_definitions;

import com.cydeo.pages.TryCloudPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TryCloud_StepDef {
    TryCloudPage tryCloudPage = new TryCloudPage();

    @Given("user on the login page http:\\/\\/qa3.trycloud.net\\/index.php\\/login?clear={int}")
    public void user_on_the_login_page_http_qa3_trycloud_net_index_php_login_clear(Integer int1) {
        Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=1");

    }
    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String username, String password) {
        tryCloudPage.username.sendKeys(username);
        tryCloudPage.password.sendKeys(password);
    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        tryCloudPage.loginBtn.click();

    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }


}
