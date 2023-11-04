package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JsExecutor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //starts execution when it finds element within 20 seconds.

//  instead we give code and execute in console directly,
//  we can convert driver to jsexecutor to execute script from here to in console of this given browser
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("console.log('Hello');");

        //driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_14']")).click(); or webelement.click();
        //in case, direct click is not work and it gives elementclickinterceptedexception
        // (bcoz given webelement is not in the browser view portal bcoz element may be in bottom of the page)
        // so to handle elementclickedinterceptedexception
        // (method 1)- direct click to checkbox.
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_25']"));
        js.executeScript("arguments[0].click();",checkbox);


        //(method 2) for handling this exception - scroll to checkbox, click.
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_25']"));
        js.executeScript("arguments[0].scrollIntoView();",checkbox2);
        checkbox2.click();

        //printing Title using JSscript.
        System.out.println(js.executeScript("return document.title;"));

        // or convert to string and print.
        String title1  = (String) js.executeScript("return document.title");
        System.out.println(title1);




    }
}
