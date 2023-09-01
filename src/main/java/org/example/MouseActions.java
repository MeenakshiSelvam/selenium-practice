package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class MouseActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/inputtools/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement element = driver.findElement(By.xpath("//a[@data-g-label='On Chrome']" ));
        WebElement element1 = driver.findElement(By.xpath("//a[@data-g-label='On Google Services']" ));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();//build may use or not for one function.
        action.click(element).contextClick(element1).build().perform();














































//        actions.moveToElement(checkout_here).build().perform();
//        actions.contextClick(checkout_here).build().perform();
//        actions.click(checkout_here).contextClick(checkout_here).build().perform();










    }
}
