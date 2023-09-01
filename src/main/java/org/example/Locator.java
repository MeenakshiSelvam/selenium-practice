package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Locator {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       //button value only single quotes.
    //    driver.findElement(By.className("oxd-input oxd-input--active"));

        driver.findElement(By.cssSelector("button[type='submit']")); //1 way of select the button.
        driver.findElement(By.id("app"));
        driver.findElement(By.linkText("OrangeHRM, Inc"));
        driver.findElement(By.partialLinkText("OrangeHRM"));
        driver.findElement(By.tagName("button"));
//        driver.findElement(By.name("username"));



        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));

        username.sendKeys("Admin");
        username.click();
//        username.clear();



        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");



        WebElement button= driver.findElement(By.xpath("//button[@type='submit']")); // 2nd way of selecting the button.
        button.click();


        List<WebElement> list1= driver.findElements(By.xpath("//input"));
        System.out.println(list1.size());
        List<WebElement> list2= driver.findElements(By.xpath("//input1"));
        System.out.println(list2.size());



    }

}

//xpath 2 types: absolute /,relative //.