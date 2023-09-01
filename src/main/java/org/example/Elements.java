package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Elements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
// to upload file. 1. send a file
        WebElement upload= driver.findElement(By.xpath("//input[@id='file-upload']"));
        // can we click to upload? click and upload   or we should only use send keys to send file.
        upload.sendKeys("C:\\Users\\Meenakshi\\IdeaProjects\\selenium-practice\\src\\main\\java\\org\\example\\uploading.txt");
//2.click upload.
        WebElement click_upload = driver.findElement(By.xpath("//input[@id='file-submit']"));
        click_upload.click();

        //Date Picker.
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://selectorshub.com/xpath-practice-page/");
        WebElement date = driver1.findElement(By.xpath("//input[@type='date']"));
        date.sendKeys("26082023");

        // select from dropdown list

        WebDriver driver3= new ChromeDriver();
        driver3.get("https://selectorshub.com/xpath-practice-page/");
        WebElement drop = driver3.findElement(By.name("cars"));
//  same as above      WebElement drop = driver3.findElement(By.id("cars"));
//  same as above      WebElement drop = driver3.findElement(By.xpath("//select[@id='cars']"));

        drop.sendKeys("Audi");



    }
}



