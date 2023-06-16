package org.example.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.HookTestStep;
import org.example.Pages.LoginPage;
import org.example.Pages.ResgistrationPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginStepDef {
    LoginPage login = new LoginPage();
    SoftAssert soft = new SoftAssert();
    @Given("user click on login button from home page")
    public void user_click_on_login_button_from_home_page()
    {
        login.url_to_go();
        login.login_button().click();
    }

    @And("I am on the login page")
    public void iam_in_the_login_page()
    {
        String currUrl = Hooks.driver.getCurrentUrl();

        soft.assertEquals("https://demo.nopcommerce.com/login?returnUrl=%2F",currUrl);
        soft.assertAll();
    }
    @When("^I enter Email\"(.*)\" and password\"(.*)\"$")
    public void i_enter_cerdentials(String Email , String password) throws InterruptedException {
        login.userName().sendKeys(Email);
        login.password().sendKeys(password);
        Thread.sleep(3000);
    }
    @And("click the login button")
    public void click_the_login_button() throws InterruptedException {
        login.clickOnLoginButton().click();
        Thread.sleep(3000);
    }
    @Then("I should be redirected to the home page")
    public void redirected_to_homepage()
    {
        String url = Hooks.driver.getCurrentUrl();
        soft.assertEquals(url,"https://demo.nopcommerce.com/");
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]")).isDisplayed());
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[class=\"ico-logout\"]")).isDisplayed());
        soft.assertAll();
    }

    @Then("I should see an error message")
    public void error_message_appear() throws InterruptedException {
        login.error_message();
        Thread.sleep(3000);
    }

    @And("remain on the login page")
    public void remain_in_loginpage()
    {
        String url = Hooks.driver.getCurrentUrl();
        soft.assertEquals("https://demo.nopcommerce.com/login?returnurl=%2F",url);
        soft.assertAll();

    }
}
