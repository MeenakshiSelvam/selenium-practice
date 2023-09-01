package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Dragdrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement from = driver.findElement(By.id("fourth"));

        //Element on which need to drop.
        WebElement to = driver.findElement(By.xpath("//ol[@id='amt7']"));

        //Using Action class for drag and drop.
        Actions actions=new Actions(driver);

        //Dragged and dropped.
        actions.clickAndHold(from).moveToElement(to)
                .release().build().perform();

        //or

//        actions.dragAndDrop(from, to).build().perform();
    }
}
