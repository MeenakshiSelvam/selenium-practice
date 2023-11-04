package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Screenshot {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.urlContains("dashboard"));


        TakesScreenshot ss = (TakesScreenshot) driver;
        File screenshot_file = ss.getScreenshotAs(OutputType.FILE);
        File destination_file = new File("Lg.png");
        try {
            FileUtils.copyFile(screenshot_file, destination_file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
