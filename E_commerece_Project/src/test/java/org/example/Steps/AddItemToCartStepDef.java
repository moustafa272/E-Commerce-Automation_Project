package org.example.Steps;

import io.cucumber.java.en.And;
import org.example.Pages.AddItemToCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static org.example.Steps.Hooks.driver;

public class AddItemToCartStepDef {
    AddItemToCartPage addItem = new AddItemToCartPage();
    SoftAssert soft = new SoftAssert();
@And("User Click on Item Button")
    public void User_Click_on_Item_Button() throws InterruptedException {
        // To Scroll down page
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, 3000)");
        Actions actions = new Actions(driver);
        WebElement scroll = driver.findElement(By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]"));
        actions.scrollToElement(scroll).perform();
        Thread.sleep(3000);
        addItem.AddItemButton().click();
    }
@And("^User should Add Product Details Processor\"(.*)\" RAM\"(.*)\" HDD\"(.*)\" OS\"(.*)\" Software\"(.*)\" and Navigate to Shopping Cart and Check all shopping carts Elements$")
    public void User_should_Add_Product_Details(String Processor , String RAM , String HDD , String OS , String Software ) throws InterruptedException {
    // To Scroll down page
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("window.scrollBy(0, 3000)");
    Actions actions = new Actions(driver);
    WebElement scroll = driver.findElement(By.id("sku-1"));
    actions.scrollToElement(scroll).perform();
    Thread.sleep(3000);
    // Start adding Data
    System.out.println("Add Data");
    Select selectprocessor = new Select(addItem.SelectProcessor());
    selectprocessor.selectByVisibleText(Processor);
    Thread.sleep(3000);
    Select SelectRam = new Select(addItem.SelectRam());
    SelectRam.selectByVisibleText(RAM);
    Thread.sleep(3000);
    addItem.HDDType(HDD).click();
    Thread.sleep(3000);
    addItem.OSType(OS).click();
    Thread.sleep(3000);
    addItem.softwareType(Software).click();
    Thread.sleep(3000);
    addItem.clk_Add().click();
    Thread.sleep(3000);
    //Assert Success of Enter Valid Data
    String expected_result = addItem.success_message().getText();
    String actual_Result = "The product has been added to your";
    soft.assertTrue(expected_result.contains(actual_Result));
    addItem.close_Text_Message().click();
    addItem.open_Shopping_Carts().click();
    soft.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/cart"));
    soft.assertAll();
}
}
