package org.example.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Pages.ForgotpasswordPage;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class forgotpasswordStepDef {
    ForgotpasswordPage forgetPass = new ForgotpasswordPage();
    SoftAssert soft = new SoftAssert();

    @And("user click on forget password")
    public void user_click_on_forget_password() {
        forgetPass.clickonforget().click();
    }

    @And("user enter email address")
    public void user_enter_email_address()
    {
        forgetPass.put_mail().sendKeys("tes778@gmail.com");
    }
    @And("user click on recover button")
    public void user_click_on_recover_button() throws InterruptedException {
    forgetPass.click_on_recoverButton().click();
    Thread.sleep(3000);
    }
@Then("user to reset your password")
    public void user_to_reset_password()
    {
       String message = Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]")).getText();
       String actual_txt = "Email with instructions has been sent to you.";
        soft.assertTrue(message.contains(actual_txt));
        String url = Hooks.driver.getCurrentUrl();
        String actual_url = "https://demo.nopcommerce.com/passwordrecovery";
        soft.assertTrue(url.contains(actual_url));
        soft.assertAll();
    }
}
