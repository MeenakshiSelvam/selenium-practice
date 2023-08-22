package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class App {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().refresh();
        driver.manage().window().fullscreen();
        driver.manage().window().minimize();
        driver.navigate().back();
        driver.navigate().forward();



    }


}
