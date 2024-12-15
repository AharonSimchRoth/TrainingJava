package mego.selenium;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class FirstPriceSwagLabs {
    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = seleniumBase.seleniumInit( "https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement Login = driver.findElement(By.id("login-button"));

        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        sleep(2000);
        Login.sendKeys(Keys.ENTER);

        List<WebElement> prices  = driver.findElements(By.className("inventory_item_price"));
        WebElement  firstItem = prices.get(0);
        String firstPrice = firstItem.getText();
        System.out.println(firstPrice);








        base.seleniumClose(driver);



    }
}
