package org.example.Steps;

import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.Pages.DifferentCategoriesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import static org.example.Steps.Hooks.driver;

public class DifferentCategoriesStepDef {
    DifferentCategoriesPage diff_Cats = new DifferentCategoriesPage();
    SoftAssert soft = new SoftAssert();
    Actions actions = new Actions(driver);

    @When("user move to Computers and can click on Desktops and Notebooks and software")
public void user_move_to_Computers_and_can_click_on_Desktops_and_Notebooks_and_software() throws InterruptedException {
    // move to Computers and Choose Desktops
    actions.moveToElement(diff_Cats.chooseDesktop()).perform();
    Thread.sleep(3000);
    diff_Cats.itemDesktopFromMenu().click();
    Thread.sleep(3000);
    diff_Cats.backToUrl();
    actions.moveToElement(diff_Cats.chooseDesktop()).perform();
    Thread.sleep(3000);
    diff_Cats.itemNotebooksFromMenu().click();
    Thread.sleep(3000);
    diff_Cats.backToUrl();
    actions.moveToElement(diff_Cats.chooseDesktop()).perform();
    Thread.sleep(3000);
    diff_Cats.itemSoftwareFromMenu().click();
    Thread.sleep(3000);
}
@And("User move to Electronics and can click on camera&photo and cellPhones and Others")
public void User_move_to_Electronics_and_can_click_on_camera_photo_and_cellPhones_and_Others() throws InterruptedException {
        actions.moveToElement(diff_Cats.chooseElectronics()).perform();
        Thread.sleep(3000);
        diff_Cats.itemCamAndPhotosFromMenu().click();
        Thread.sleep(3000);
        diff_Cats.backToUrl();
    actions.moveToElement(diff_Cats.chooseElectronics()).perform();
        Thread.sleep(3000);
        diff_Cats.itemcellPhonesFromMenu().click();
        Thread.sleep(3000);
        diff_Cats.backToUrl();
    actions.moveToElement(diff_Cats.chooseElectronics()).perform();
        Thread.sleep(3000);
        diff_Cats.itemOthersFromMenu().click();
        Thread.sleep(3000);
    }
@And("User move to Apparel and can click on Clothing and Shoes and Accessorirs")
    public void User_move_to_Apparel_and_can_click_on_Clothing_and_Shoes_and_Accessorirs() throws InterruptedException {
    actions.moveToElement(diff_Cats.chooseApparel()).perform();
    Thread.sleep(3000);
    diff_Cats.itemShoesFromMenu().click();
    Thread.sleep(3000);
    diff_Cats.backToUrl();
    actions.moveToElement(diff_Cats.chooseApparel()).perform();
    Thread.sleep(3000);
    diff_Cats.itemclothingFromMenu().click();
    Thread.sleep(3000);
    diff_Cats.backToUrl();
    actions.moveToElement(diff_Cats.chooseApparel()).perform();
    Thread.sleep(3000);
    diff_Cats.itemaccessoriesFromMenu().click();
    Thread.sleep(3000);
}
@And("User Click on Digital Downloads")
    public void User_Click_on_Digital_Downloads() throws InterruptedException {
    diff_Cats.DigetalDownload().click();
    String currUrl = "https://demo.nopcommerce.com/digital-downloads";
    String exp_Url = driver.getCurrentUrl();
    System.out.println(exp_Url);
    soft.assertEquals(exp_Url,currUrl);
    // To Scroll down page
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("window.scrollBy(0, 3000)");
    Actions actions = new Actions(driver);
    WebElement scroll = driver.findElement(By.cssSelector("div[class=\"products-wrapper\"]"));
    actions.scrollToElement(scroll).perform();
    Thread.sleep(3000);
    int NumOfProudct = driver.findElements(By.cssSelector("div[class=\"products-wrapper\"]")).size();
    System.out.println(NumOfProudct);
    soft.assertTrue(NumOfProudct>0);
    soft.assertAll();
}

@And("User Click on Books")
    public void User_Click_on_Books() throws InterruptedException {
    diff_Cats.BooKs().click();
    String currUrl = "https://demo.nopcommerce.com/books";
    String exp_Url = driver.getCurrentUrl();
    System.out.println(exp_Url);
    soft.assertEquals(exp_Url,currUrl);
    // To Scroll down page
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("window.scrollBy(0, 3000)");
    Actions actions = new Actions(driver);
    WebElement scroll = driver.findElement(By.cssSelector("div[class=\"product-grid\"]"));
    actions.scrollToElement(scroll).perform();
    Thread.sleep(3000);
    int NumOfProudct = driver.findElements(By.cssSelector("div[class=\"product-grid\"]")).size();
    System.out.println(NumOfProudct);
    soft.assertTrue(NumOfProudct>0);
    soft.assertAll();
}
@And("User Click on Jewelry")
    public void User_Click_on_Jewelry() throws InterruptedException {
    diff_Cats.Jewelry().click();
    String currUrl = "https://demo.nopcommerce.com/jewelry";
    String exp_Url = driver.getCurrentUrl();
    System.out.println(exp_Url);
    soft.assertEquals(exp_Url,currUrl);
    // To Scroll down page
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("window.scrollBy(0, 3000)");
    Actions actions = new Actions(driver);
    WebElement scroll = driver.findElement(By.cssSelector("div[class=\"item-grid\"]"));
    actions.scrollToElement(scroll).perform();
    Thread.sleep(3000);
    int NumOfProudct = driver.findElements(By.cssSelector("div[class=\"item-grid\"]")).size();
    System.out.println(NumOfProudct);
    soft.assertTrue(NumOfProudct>0);
    soft.assertAll();
}
@And("User Click on Gift Cards")
    public void User_Click_on_Gift_Cards() throws InterruptedException {
    diff_Cats.Gift_Card().click();
    String currUrl = "https://demo.nopcommerce.com/gift-cards";
    String exp_Url = driver.getCurrentUrl();
    System.out.println(exp_Url);
    soft.assertEquals(exp_Url,currUrl);
    // To Scroll down page
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("window.scrollBy(0, 3000)");
    Actions actions = new Actions(driver);
    WebElement scroll = driver.findElement(By.cssSelector("div[class=\"item-grid\"]"));
    actions.scrollToElement(scroll).perform();
    Thread.sleep(3000);
    int NumOfProudct = driver.findElements(By.cssSelector("div[class=\"item-grid\"]")).size();
    System.out.println(NumOfProudct);
    soft.assertTrue(NumOfProudct>0);
    soft.assertAll();
}
}
