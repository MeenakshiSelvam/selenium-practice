package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Nestedframes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        driver.switchTo().frame(0);
//        driver.switchTo().frame(0);
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String Left = driver.findElement(By.xpath("//body")).getText();
        System.out.println(Left);

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        String Middle = driver.findElement(By.id("content")).getText();
        System.out.println(Middle);
        driver.switchTo().parentFrame();

        driver.switchTo().frame("frame-right");
        String Right = driver.findElement(By.tagName("body")).getText();
        System.out.println(Right);
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame-bottom");
        String BottomText = driver.findElement(By.xpath("//body")).getText();
        System.out.println(BottomText);
        driver.switchTo().defaultContent();


        driver.quit();




    }
}
