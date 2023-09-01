package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Keyboard {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/inputtools/try/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.id("demobox")).sendKeys("Hello, \n");
        driver.findElement(By.id("demobox")).sendKeys("World");
        driver.findElement(By.id("demobox")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("demobox")).sendKeys("Welcome To");
        driver.findElement(By.id("demobox")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("demobox")).sendKeys("India");
//        driver.findElement(By.id("demobox")).sendKeys(Keys.ENTER);
//        driver.findElement(By.id("demobox")).sendKeys(Keys.CONTROL);
//        driver.findElement(By.id("demobox")).sendKeys("Addition");
//        driver.findElement(By.id("demobox")).sendKeys(Keys.SEMICOLON);
//        driver.findElement(By.id("demobox")).sendKeys(Keys.ENTER);
//        driver.findElement(By.id("demobox")).sendKeys(Keys.TAB);
//        driver.findElement(By.id("demobox")).sendKeys(Keys.NUMPAD1);
//        driver.findElement(By.id("demobox")).sendKeys(Keys.ADD);
//        driver.findElement(By.id("demobox")).sendKeys(Keys.NUMPAD2);
//        driver.findElement(By.id("demobox")).sendKeys(Keys.EQUALS);
//        driver.findElement(By.id("demobox")).sendKeys(Keys.NUMPAD3);
//        driver.findElement(By.id("demobox")).sendKeys("h");
//        driver.findElement(By.id("demobox")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.id("demobox")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        driver.findElement(By.id("demobox")).sendKeys(Keys.DELETE);


































    }
}
