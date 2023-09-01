package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Plugins {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //starts execution when it find element within 20 seconds.
        WebElement button=driver.findElement(By.xpath("//button[text()='Checkout here']"));
        System.out.println(button.getText());

        WebElement button1 = driver.findElement(By.xpath("//button[contains(text(),'Check')]"));
        System.out.println(button1.getText());

        WebElement normalize = driver.findElement(By.xpath("//button[normalize-space()='Checkout here']"));
        System.out.println(normalize.getText());




        WebElement fname= driver.findElement(By.xpath("//input[@placeholder='First Enter name']"));
        System.out.println(fname.getText());
        System.out.println(fname.isEnabled());
        System.out.println(fname.isDisplayed());
        System.out.println(fname.isSelected());

        WebElement joe = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_21']"));
        System.out.println(joe.isEnabled());
        System.out.println(joe.isSelected());
        System.out.println(joe.isDisplayed());
        joe.click();

        try{
            Thread.sleep(5000); // it finds element and starts execution only after the 5000ms is finished.

        }
        catch(Exception e)
        {
            System.out.println("Exception Thread Error ");

        }
        System.out.println(joe.isSelected());





    }
}
