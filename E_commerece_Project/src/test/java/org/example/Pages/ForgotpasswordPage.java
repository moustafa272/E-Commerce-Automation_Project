package org.example.Pages;

import org.example.Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotpasswordPage {
public WebElement clickonforget()
{
    WebElement clk_button = Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    return clk_button;
}
public WebElement put_mail()
{
    WebElement yourmail = Hooks.driver.findElement(By.id("Email"));
    return yourmail;
}
public WebElement click_on_recoverButton()
{
    WebElement clk_rec = Hooks.driver.findElement(By.name("send-email"));
    return clk_rec;
}
}
