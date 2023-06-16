package org.example.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Pages.SwitchCurrencyPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SwitchCurrencyStepDef {
    SwitchCurrencyPage switch_currency = new SwitchCurrencyPage();
    SoftAssert soft = new SoftAssert();
@And("User click on Euro From DropDown Menu")
    public void User_click_on_Euro_From_DropDown_Menu() throws InterruptedException {
    switch_currency.clickOnDropList().click();
    // Code To Click on Drop List And Choose from Items
        Select select = new Select(switch_currency.clickOnDropList());
        select.selectByVisibleText("Euro");
        Thread.sleep(3000);
    }
@Then("Assurance That Salary converted to Euro")
    public void Assurance_That_Salary_converted_to_Euro()
    {
        String actualResult = switch_currency.sureCurrencySwitchedToActiveCurrency().getText();
        String expectetResult = "€";
        soft.assertTrue(actualResult.contains(expectetResult));
        soft.assertAll();
    }
@And("User click on Dollar From DropDown Menu")
    public void User_click_on_Dollar_From_DropDown_Menu() throws InterruptedException {
        switch_currency.clickOnDropList().click();
        // Code To Click on Drop List And Choose from Items
        Select select = new Select(switch_currency.clickOnDropList());
        select.selectByVisibleText("US Dollar");
        Thread.sleep(3000);
    }
@Then("Assurance That Salary converted to Dollar")
    public void Assurance_That_Salary_converted_to_Dollar()
    {
        String actualResult = switch_currency.sureCurrencySwitchedToActiveCurrency().getText();
        String expectetResult = "$";
        soft.assertTrue(actualResult.contains(expectetResult));
        soft.assertAll();
    }
}


