package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class App {
    public static void main(String[] args) {
//        EdgeDriver driver = new EdgeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.navigate().refresh();
//        driver.manage().window().fullscreen();
//        driver.manage().window().minimize();
//        driver.navigate().back();
//        driver.navigate().forward();


        WebDriver driver = null;
        String str = "Chrome";
        switch(str)
        {
            case "FireFox":
                driver = new FirefoxDriver();
                break;
            case "Chrome":
                driver = new ChromeDriver();
                break;
            default:
                driver = new EdgeDriver();
                break;
        }

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));

        username.sendKeys("Admin");
        username.click();
//        username.clear();
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");


        WebElement button= driver.findElement(By.xpath("//button[@type='submit']")); // 2nd way of selecting the button.
        button.click();


//        driver.quit();



    }


}



