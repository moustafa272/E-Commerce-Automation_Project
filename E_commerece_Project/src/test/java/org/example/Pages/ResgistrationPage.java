package org.example.Pages;

import org.example.Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResgistrationPage {
    public WebElement register_Button()
    {
        WebElement regbutton =  Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
        return regbutton;
    }
    public final WebElement gendertype(String type){
        WebElement gender =null;
        if(type.equals("Male")){
            gender=Hooks.driver.findElement(By.cssSelector("input[type=\"radio\"][id=\"gender-male\"]"));
        }
        else if(type.equals("Female")){
            gender=Hooks.driver.findElement(By.cssSelector("input[type=\"radio\"][id=\"gender-female\"]"));
        }
        return gender;
    }
    public WebElement first_name()
    {
        WebElement fname = Hooks.driver.findElement(By.id("FirstName"));
        return fname;
    }
    public WebElement last_name()
    {
        WebElement lname = Hooks.driver.findElement(By.id("LastName"));
        return lname;
    }
    public WebElement days()
    {
        WebElement day = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        return day;
    }
    public WebElement months()
    {
        WebElement month = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        return month;
    }
    public WebElement years()
    {
        WebElement year = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return year;
    }
    public WebElement e_mail()
    {
        WebElement emaiil = Hooks.driver.findElement(By.id("Email"));
        return emaiil;
    }
    public WebElement password()
    {
        WebElement psword = Hooks.driver.findElement(By.name("Password"));
        return psword;
    }
    public WebElement confirm_password()
    {
        WebElement cnfrmpasword = Hooks.driver.findElement(By.name("ConfirmPassword"));
        return cnfrmpasword;
    }
    public WebElement register_button_finally()
    {
        WebElement regbutton = Hooks.driver.findElement(By.id("register-button"));
        return regbutton;
    }
}

