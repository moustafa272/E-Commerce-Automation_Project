package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.Steps.Hooks.driver;

public class AddToWatchlistPage {
public WebElement clickOnBooks()
{
    WebElement clk_book = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/books\"]"));
    return clk_book;
}
    public WebElement choose_item()
    {
        WebElement element = driver.findElement(By.cssSelector("img[alt=\"Picture of Fahrenheit 451 by Ray Bradbury\"]"));
        return element;
    }
    public WebElement AddToWatchlist(){
    WebElement ADDBuT = driver.findElement(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    return ADDBuT;
    }
    public WebElement Succ_Adding_Message()
    {
        WebElement suc_add_msg = driver.findElement(By.cssSelector("p[class=\"content\"]"));
        return suc_add_msg;
    }
    public WebElement close_message()
    {
        WebElement closeMES = driver.findElement(By.cssSelector("span[class=\"close\"]"));
        return closeMES;
    }
    public WebElement Serial_Num()
    {
        WebElement serial = driver.findElement(By.cssSelector("span[class=\"sku-number\"]"));
        return serial;
    }
    public WebElement Add_to_cart_from_Table()
    {
        WebElement but = driver.findElement(By.cssSelector("input[data-gtm-form-interact-field-id=\"1\"]"));
        return but;
    }
    public WebElement add_qty()
    {
        WebElement but = driver.findElement(By.cssSelector("input[data-gtm-form-interact-field-id=\"0\"]"));
        return but;
    }
}
