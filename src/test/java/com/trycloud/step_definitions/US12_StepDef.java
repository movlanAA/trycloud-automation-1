package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.US12_ModulePage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_StepDef  {

    US12_ModulePage us12ModulePage = new US12_ModulePage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));


    }
    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String talkModule) {
        US12_ModulePage.talkModule.click();

    }


    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {

        String expectedTitle = "ContactsTryCloudQa";

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }


}



