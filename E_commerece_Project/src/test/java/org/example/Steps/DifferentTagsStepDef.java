package org.example.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.Pages.DifferentTagsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class DifferentTagsStepDef {
    DifferentTagsPage tagsPage=new DifferentTagsPage();

    @Given("navigate to digital downloads")
    public void navigate_to_digital_download() throws InterruptedException {
        Thread.sleep(2000);
        String url = "https://demo.nopcommerce.com/digital-downloads";
        Hooks.driver.navigate().to(url);
        Thread.sleep(3000);
    }

    @When("select cool from popular tags")
    public void select_cool_from_popular_tags() throws InterruptedException {
        tagsPage.cool().click();
        Thread.sleep(3000);
        By col=By.cssSelector("div[class=\"page-title\"] h1");
        WebElement cool=Hooks.driver.findElement(col);
        String actual=cool.getText();
        String expected="Products tagged with 'cool'";
        Assert.assertTrue(actual.contains(expected),"Cool tag is not selected");
        Thread.sleep(1000);
    }

    @And("select game from popular tags")
    public void select_game_from_popular_tags() throws InterruptedException {
        tagsPage.game().click();
        Thread.sleep(3000);
        By col=By.cssSelector("div[class=\"page-title\"] h1");
        WebElement cool=Hooks.driver.findElement(col);
        String actual=cool.getText();
        String expected="Products tagged with 'game'";
        Assert.assertTrue(actual.contains(expected),"game tag is selected");
        Thread.sleep(1000);
    }

    @And("select computer from popular tags")
    public void select_computer_from_popular_tags() throws InterruptedException {
        tagsPage.computer().click();
        Thread.sleep(3000);
        By col=By.cssSelector("div[class=\"page-title\"] h1");
        WebElement cool=Hooks.driver.findElement(col);
        String actual=cool.getText();
        String expected="Products tagged with 'computer'";
        Assert.assertTrue(actual.contains(expected),"computer tag is selected");
        Thread.sleep(1000);
    }
}
