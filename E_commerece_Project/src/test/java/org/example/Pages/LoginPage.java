package org.example.Pages;

import org.example.Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public void url_to_go()
    {
      Hooks.driver.get("https://demo.nopcommerce.com/");
    }

    public WebElement login_button()
    {
        WebElement log_button = Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
        return log_button;
    }
    public WebElement userName() {
        WebElement usname = Hooks.driver.findElement(By.id("Email"));
        return usname;
    }
    public WebElement password()
    {
        WebElement psword = Hooks.driver.findElement(By.id("Password"));
        return psword;
    }
    public WebElement clickOnLoginButton()
    {
        WebElement clkbutton = Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
        return clkbutton;
    }
    public WebElement welcome_text()
    {
        WebElement txt = Hooks.driver.findElement(By.cssSelector("*[contains(text(), 'Bard')]"));


        return txt;

    }
    public WebElement error_message()
    {
        WebElement errmessge = Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
        return errmessge;
    }

}

