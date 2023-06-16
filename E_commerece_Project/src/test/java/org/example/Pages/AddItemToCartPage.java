package org.example.Pages;

import org.example.Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.Steps.Hooks.driver;

public class AddItemToCartPage {
    public WebElement AddItemButton()
    {
        WebElement AddItmBut = driver.findElement(By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]"));
        return AddItmBut;
    }
    public WebElement clk_Add()
    {
        WebElement fin_add = driver.findElement(By.id("add-to-cart-button-1"));
        return fin_add;
    }

    public WebElement SelectProcessor()
    {
        WebElement slct_processor = driver.findElement(By.id("product_attribute_1"));
        return slct_processor;
    }
    public WebElement SelectRam ()
    {
        WebElement slctRam = driver.findElement(By.id("product_attribute_2"));
        return slctRam;
    }
    public final WebElement HDDType(String type)
    {
        WebElement hdd1 = null;
        if (type.equals("320 GB"))    {
        hdd1 = driver.findElement(By.id("product_attribute_3_6"));}
        else if(type.equals("400 GB [+$100.00]")){
       hdd1 = driver.findElement(By.id("product_attribute_3_7")); }
        return hdd1;
    }
    public final WebElement OSType(String type)
    {
        WebElement OS = null;
        if (type.equals("Vista Home [+$50.00]"))    {
            OS = driver.findElement(By.id("product_attribute_4_8"));}
        else if(type.equals("Vista Premium [+$60.00]")){
            OS = driver.findElement(By.id("product_attribute_4_9")); }
        return OS;
    }
public final WebElement softwareType(String type){
        WebElement software_slct = null;
        if (type.equals("Microsoft Office [+$50.00]")){
software_slct = driver.findElement(By.id("product_attribute_5_10"));}
        else if (type.equals("Acrobat Reader [+$10.00]")) {
        software_slct = driver.findElement(By.id("product_attribute_5_11"));
        }
        else if (type.equals("Total Commander [+$5.00]")){
            software_slct= driver.findElement(By.id("product_attribute_5_12"));
        }
        return software_slct;
        }
        public WebElement success_message()
        {
            WebElement scss_msg = driver.findElement(By.cssSelector("p[class=\"content\"]"));
            return scss_msg;
        }
        public WebElement close_Text_Message()
        {
            WebElement colse_msg = driver.findElement(By.cssSelector("span[class=\"close\"]"));
            return colse_msg;
        }
        public WebElement open_Shopping_Carts()
        {
            WebElement opn_shp = driver.findElement(By.cssSelector("span[class=\"cart-label\"]"));
            return opn_shp;
        }


}
