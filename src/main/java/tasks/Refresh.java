package tasks;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.navigate().refresh();
        //name in search box
        driver.findElement(By.name("")).sendKeys(Keys.F5);
        //navigate tio cuurent url
        driver.navigate().to(driver.getCurrentUrl());
        //ascii code
        driver.findElement(By.name("")).sendKeys("\uE035");


    }
}
