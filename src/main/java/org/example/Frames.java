package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement iframe =  driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.cssSelector("body p")).sendKeys("Hi");
        System.out.println(driver.findElement(By.cssSelector("body p")).getText());

        driver.switchTo().defaultContent();




    }
}
