package org.example.Pages;

import org.example.Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SwitchCurrencyPage {
    public WebElement clickOnDropList()
    {
        WebElement Swtch_ele = Hooks.driver.findElement(By.id("customerCurrency"));
        return Swtch_ele;
    }
    public WebElement sureCurrencySwitchedToActiveCurrency()
    {
        WebElement cuurencySelected = Hooks.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
        return cuurencySelected;
    }





}
