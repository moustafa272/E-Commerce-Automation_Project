package org.example.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.ResgistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class RegistrationStepDef {
    ResgistrationPage register = new ResgistrationPage();
    @And("user navigate to home page")
    public void user_navigate_to_home_page()
    {
       Hooks.driver.navigate() .to("https://demo.nopcommerce.com/");
    }
    @And("user click register")
    public void user_click_register() throws InterruptedException {
        register.register_Button().click();
        Thread.sleep(3000);
    }
    @When("^user fills gender\"(.*)\" fname\"(.*)\" lname\"(.*)\" day\"(.*)\" month\"(.*)\" year\"(.*)\" email\"(.*)\" valid data$")
    public void user_fills_personal_valid_data(String gender,String fname,String lname,String day,String month,String year,String email) throws InterruptedException {
        Thread.sleep(3000);
        register.gendertype(gender).click();
        register.first_name().sendKeys(fname);
        register.last_name().sendKeys(lname);
        Thread.sleep(3000);

        Select selectedday =new Select(register.days());
        selectedday.selectByVisibleText(day);
        Select selectedmonth =new Select(register.months());
        selectedmonth.selectByValue(month);
        Select selectedyear =new Select(register.years());
        selectedyear.selectByVisibleText(year);
        register.e_mail().sendKeys(email);
    }
    @And("^user fills valid password \"(.*)\" confirm \"(.*)\"$")
    public void user_fills_valid_password(String password , String confirm)
    {
        register.password().sendKeys(password);
        register.confirm_password().sendKeys(confirm);
    }
    @And("user clicks register button")
    public void user_click_register_button() throws InterruptedException {
        register.register_button_finally().click();
        Thread.sleep(3000);
    }
    @Then("success message is displayed")
    public void success_message_is_displayed()
    {
        String url = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(url,"https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("a[class=\"button-1 register-continue-button\"]")).isDisplayed());

    }
}
