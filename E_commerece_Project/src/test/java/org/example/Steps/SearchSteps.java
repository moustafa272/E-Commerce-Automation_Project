package org.example.Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.SearchPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import static org.example.Steps.Hooks.driver;

public class SearchSteps {
    SearchPage search = new SearchPage();
    SoftAssert soft = new SoftAssert();

@When("user click on search field")
    public void user_click_on_search_field()
    {
    search.clk_on_search_field().click();
    }
@And("user click on button search")
    public void clk_Button() throws InterruptedException {
        search.search_Button().click();
        Thread.sleep(5000);
    }
@Then("user Get Failure Message")
    public void user_Get_Failure_Message() throws InterruptedException {
       //Alert Messages
        Alert simpleAlert = driver.switchTo().alert();
        String Message = simpleAlert.getText();
        Thread.sleep(3000);
        System.out.println(Message);
        simpleAlert.accept();
        Thread.sleep(3000);

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        String errorText = (String) js.executeScript("return document.querySelector('.error').textContent");
       // System.out.println(errorText);
    }

@And("user enter {string} to search")
    public void user_enter_search_word_to_search(String searchName) throws InterruptedException {
    search.clk_on_search_field().sendKeys(searchName);
    Thread.sleep(3000);
    search.search_Button().click();
    Thread.sleep(3000);
    }
@Then("user get search item and related items")
    public void user_get_search_item_and_related_items() throws InterruptedException {
     int numOfProducts = driver.findElements(By.cssSelector("div[class=\"product-item\"]")).size();
    soft.assertTrue(numOfProducts>0);
    Thread.sleep(3000);
    // To Scroll down page
    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
    jsExecutor.executeScript("window.scrollBy(0, 5000)");
    Actions actions = new Actions(driver);
    WebElement scroll = driver.findElement(By.cssSelector("div[class=\"product-item\"]"));
    actions.scrollToElement(scroll).perform();
    Thread.sleep(3000);
    // Assertions
    String actualUrl = driver.getCurrentUrl();
    String expectedUrl = "https://demo.nopcommerce.com/search";
    soft.assertTrue(actualUrl.contains(expectedUrl));
    soft.assertAll();
    }
    @Then("^user get \"(.*)\" only$")
    public void user_get_one_result_to_search(String value) throws InterruptedException {
    int numOfItems = driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
    soft.assertEquals(numOfItems,1);
    Thread.sleep(3000);
        // To Scroll down page
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, 3000)");
        Actions actions = new Actions(driver);
        WebElement scroll = driver.findElement(By.cssSelector("h2[class=\"product-title\"]"));
        actions.scrollToElement(scroll).perform();
        Thread.sleep(3000);
        String curntURL= driver.getCurrentUrl();
        String expctdURL = "https://demo.nopcommerce.com/search";
        soft.assertTrue(curntURL.contains(expctdURL));
        soft.assertAll();

    }
}
