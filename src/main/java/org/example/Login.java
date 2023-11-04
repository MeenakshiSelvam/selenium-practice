package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
        username.sendKeys("Admin");
        pwd.sendKeys("admin123");
        login.click();

    }
}
