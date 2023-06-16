package org.example.Pages;

import io.cucumber.messages.types.Hook;
import org.example.Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public WebElement clk_on_search_field ()
    {
        WebElement searchField = Hooks.driver.findElement(By.id("small-searchterms"));
        return searchField;
    }
    public WebElement search_Button()
    {
        WebElement srch_but = Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
        return srch_but;
    }
    public WebElement messageToFail()
    {
        WebElement message = Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
        return message;
    }
    public WebElement scroll()
    {
        WebElement scrollToBottom = Hooks.driver.findElement(By.cssSelector("div[class=\"product-item\"]"));
        return scrollToBottom;
    }
}
