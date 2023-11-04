package nonWebelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class JsAlerts {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement alert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
        Actions action = new Actions(driver);
        action.click(alert).build().perform();
        Alert a = driver.switchTo().alert();
        a.accept();

        try {
            Thread.sleep(1750);
        } catch (Exception e) {

        }
        WebElement alert2 = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
        action.click(alert2).build().perform();
        Alert b = driver.switchTo().alert();
//        b.accept();
//        b.dismiss();
        String Text = b.getText();
        System.out.println(Text);
        b.dismiss();


        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert c = driver.switchTo().alert();
//        c.accept();
//        c.dismiss();
        c.sendKeys("Hello");
        c.accept();










//unhandledalertexception - give accept or dismiss.

    }
}





