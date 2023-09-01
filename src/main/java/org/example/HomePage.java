package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.navigate().refresh();
        HomePage h = new HomePage();
        WebElement user = driver.findElement(userEmail);
        h.fillUserEmail("@gmail.com");
    }
    private static final By userEmail= By.id("userId");
    private static final By password= By.xpath("//input[@name='Password']");
    private static final By company = By.xpath("//input[@name='company']");
    private static final By number = By.xpath("//input[@name='mobile number']");
    private static final By car = By.xpath("//select[@id='cars']");
    private static final By submit = By.xpath("//input[@value='Submit']");
    public void fillUserEmail(String email)
    {
        System.out.println(email);
    }
    public void fillPassword(String pwd)
    {
    }
    public void fillCompanyName(String name)
    {
    }
    public void fillMobile(int no)
    {
    }
    public void clickSubmit()
    {
    }



}
