package mego.selenium;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class ebayGet {
    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = seleniumBase.seleniumInit( "https://www.ebay.com/");



        WebElement serch = driver.findElement(By.id("gh-ac"));
        serch.sendKeys("table");
        serch.sendKeys(Keys.ENTER);

        sleep(3333);

        base.seleniumClose(driver);
    }
}
