package org.example.Pages;

import org.example.Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.Steps.Hooks.driver;

public class DifferentCategoriesPage {
    public void backToUrl()
    {
         driver.navigate().back();
    }
public WebElement chooseDesktop()
{
    WebElement element = driver.findElement(By.cssSelector("div[class=\"master-wrapper-page\"]>div[class=\"header-menu\"]>ul[class=\"top-menu notmobile\"]>li>a[href=\"/computers\"]"));
    return element;
}
    public WebElement chooseElectronics()
    {
        WebElement element = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/electronics\"]"));
        return element;
    }
    public WebElement chooseApparel()
    {
        WebElement element = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/apparel\"]"));
        return element;
    }
    public WebElement itemDesktopFromMenu()
    {
        WebElement item = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/desktops\"]"));
        return item;
    }
    public WebElement itemNotebooksFromMenu()
    {
        WebElement item = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/notebooks\"]"));
        return item;
    }
    public WebElement itemSoftwareFromMenu()
    {
        WebElement item = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/software\"]"));
        return item;
    }
    public WebElement itemCamAndPhotosFromMenu()
    {
        WebElement item = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul>li>a[href=\"/camera-photo\"]"));
        return item;
    }

    public WebElement itemcellPhonesFromMenu()
    {
        WebElement item = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul>li>a[href=\"/cell-phones\"]"));
        return item;
    }
    public WebElement itemOthersFromMenu()
    {
        WebElement item = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul>li>a[href=\"/others\"]"));
        return item;
    }
    public WebElement itemShoesFromMenu()
    {
        WebElement item = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul>li>a[href=\"/shoes\"]"));
        return item;
    }
    public WebElement itemclothingFromMenu()
    {
        WebElement item = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul>li>a[href=\"/clothing\"]"));
        return item;
    }
    public WebElement itemaccessoriesFromMenu()
    {
        WebElement item = driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul>li>a[href=\"/accessories\"]"));
        return item;
    }
public WebElement DigetalDownload()
{
    WebElement dig_Downs = driver.findElement(By.cssSelector("div[class=\"master-wrapper-page\"]>div[class=\"header-menu\"]>ul[class=\"top-menu notmobile\"]>li>a[href=\"/digital-downloads\"]"));
    return dig_Downs;
}
public WebElement BooKs()
{
        WebElement book = driver.findElement(By.cssSelector("div[class=\"master-wrapper-page\"]>div[class=\"header-menu\"]>ul[class=\"top-menu notmobile\"]>li>a[href=\"/books\"]"));
    return book;
}
    public WebElement Jewelry()
    {
        WebElement Jewelry_Butt = driver.findElement(By.cssSelector("div[class=\"master-wrapper-page\"]>div[class=\"header-menu\"]>ul[class=\"top-menu notmobile\"]>li>a[href=\"/jewelry\"]"));
        return Jewelry_Butt;
    }
    public WebElement Gift_Card()
    {
        WebElement GftCrd = driver.findElement(By.cssSelector("div[class=\"master-wrapper-page\"]>div[class=\"header-menu\"]>ul[class=\"top-menu notmobile\"]>li>a[href=\"/gift-cards\"]"));
        return GftCrd;
    }




}
