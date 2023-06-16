package org.example.Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.Pages.AddToWatchlistPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import static org.example.Steps.Hooks.driver;
public class AddToWatchlistStepDef {
    AddToWatchlistPage watchlistPage = new AddToWatchlistPage();
    SoftAssert soft = new SoftAssert();
    Actions actions = new Actions(driver);
@And("user go to Book from Books Category")
    public void user_go_to_Book_from_Books_Category() throws InterruptedException {
    watchlistPage.clickOnBooks().click();
    Thread.sleep(3000);
    String Exp_Url = driver.getCurrentUrl();
    String Curr_url= "https://demo.nopcommerce.com/books";
    soft.assertTrue(Exp_Url.contains(Curr_url));
    soft.assertAll();
}
@And("User add Item to WatchList")
    public void User_add_Item_to_WatchList() throws InterruptedException {
    actions.moveToElement(watchlistPage.choose_item()).perform();
    Thread.sleep(3000);
    watchlistPage.AddToWatchlist().click();
    String TextSuccessAdd = "The product has been added to your";
    String Current_Get_Message = watchlistPage.Succ_Adding_Message().getText();
    soft.assertTrue(Current_Get_Message.contains(TextSuccessAdd));
    soft.assertAll();
    Thread.sleep(3000);
}
@And("User click on exit message")
    public void User_click_on_exit_message() throws InterruptedException {
    watchlistPage.close_message().click();
    Thread.sleep(3000);

    }
    @And("User go to watchlist")
    public void User_go_to_watchlist(){
        driver.get("https://demo.nopcommerce.com/wishlist");
        String serial_Number = watchlistPage.Serial_Num().getText();
        String actual_serial = "FR_451_RB";
        soft.assertTrue(serial_Number.contains(actual_serial));
        String img = driver.findElement(By.cssSelector("img[alt=\"Picture of Fahrenheit 451 by Ray Bradbury\"]")).getAttribute("title");
        String title = "Show details for Fahrenheit 451 by Ray Bradbury";
        soft.assertTrue(img.contains(title));
        String product = driver.findElement(By.cssSelector("a[class=\"product-name\"]")).getText();
        String actual_prdct = "Fahrenheit 451 by Ray Bradbury";
        soft.assertTrue(product.contains(actual_prdct));
        soft.assertAll();
    }



@And("click on add to cart")
public void Recheck_Total_and_click_on_add_to_cart() throws InterruptedException {

    Thread.sleep(3000);
    driver.findElement(By.cssSelector("button[name=\"addtocartbutton\"]")).click();
    Thread.sleep(3000);
    }
@And("Verify item Added to cart")
    public void Verify_item_Added_to_cart(){
    driver.get("https://demo.nopcommerce.com/cart");
    

    }
}
