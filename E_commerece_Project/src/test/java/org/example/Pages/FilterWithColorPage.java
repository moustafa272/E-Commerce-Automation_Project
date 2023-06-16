package org.example.Pages;

import org.example.Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FilterWithColorPage {

    public WebElement Apparelthenshoes(){
        By apparel=By.xpath("//ul[@class=\"top-menu notmobile\"]//li//a[@href=\"/apparel\"]");
        WebElement app= Hooks.driver.findElement(apparel);
        Actions action =new Actions(Hooks.driver);
        action.moveToElement(app).build().perform();
        By shoes=By.xpath("//ul[@class=\"top-menu notmobile\"]//li//a[@href=\"/shoes\"]");
        WebElement sho=Hooks.driver.findElement(shoes);
        action.moveToElement(sho).build().perform();
        return sho;
    }

    public WebElement filteredcolorbutn(){
        By butn=By.cssSelector("input[id=\"attribute-option-15\"]");
        WebElement filterbutn=Hooks.driver.findElement(butn);
        return filterbutn;
    }
}
