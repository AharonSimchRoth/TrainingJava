package mego.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class linkExample {
    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = seleniumBase.seleniumInit( "https://demo.guru99.com/test/newtours/reservation.php");


        WebElement hotels =  driver.findElement(By.linkText("Hotels"));
        WebElement hotePartial =  driver.findElement(By.partialLinkText("Hote"));
        String text = hotePartial.getText();
        hotePartial.click();
        sleep(3000);




        base.seleniumClose(driver);

    }
}
