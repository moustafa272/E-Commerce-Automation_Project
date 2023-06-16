package org.example.Pages;

import org.example.Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DifferentTagsPage {
    public WebElement cool(){
        WebElement cool= Hooks.driver.findElement(By.cssSelector("a[href=\"/cool\"]"));
        return cool;
    }
    public WebElement game(){
        By col=By.cssSelector("a[href=\"/game\"]");
        WebElement cool= Hooks.driver.findElement(col);
        return cool;
    }
    public WebElement computer(){
        By col=By.cssSelector("a[href=\"/computer\"]");
        WebElement cool= Hooks.driver.findElement(col);
        return cool;
    }

}
