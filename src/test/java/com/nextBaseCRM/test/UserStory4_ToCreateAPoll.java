package com.nextBaseCRM.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserStory4_ToCreateAPoll {
    public static void main(String[] args) throws InterruptedException {


           WebDriverManager.chromedriver().setup();

           WebDriver driver = new ChromeDriver();

           driver.get("https://login2.nextbasecrm.com/stream/");

           driver.manage().window().maximize();

           driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk39@cybertekschool.com");
           driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
           driver.findElement(By.className("login-btn")).click();






    }
}
