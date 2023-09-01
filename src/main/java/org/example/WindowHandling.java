package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.linkText("Find out how to automate these controls without XPath")).click();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        System.out.println(driver.getTitle());

        String current_window = driver.getWindowHandle();
        Set<String> all_windows = driver.getWindowHandles();

        for(String var : all_windows)
        {
            System.out.println(var);
            if(!var.equalsIgnoreCase(current_window))
            {
                driver.switchTo().window(var);
                System.out.println(driver.getTitle());
            }
        }

        System.out.println(driver.getTitle());
        driver.quit();




    }
}



