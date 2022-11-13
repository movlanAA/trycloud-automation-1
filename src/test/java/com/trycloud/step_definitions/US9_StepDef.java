package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.US9_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US9_StepDef {
    US9_Page us9_page=new US9_Page();

    LoginPage loginPage=new LoginPage();
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginBtn.click();

    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        BrowserUtils.waitFor(3);
        us9_page.fileModules.click();

    }

    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        BrowserUtils.waitFor(3);
        us9_page.actionIcon.click();

    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        BrowserUtils.waitFor(3);
        us9_page.detailOptions.click();

    }

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        BrowserUtils.waitFor(3);
        us9_page.postMessage.click();
        us9_page.message.sendKeys("Group 03");


    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        BrowserUtils.waitFor(3);
        us9_page.submitButton.click();

    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {

    }
}
