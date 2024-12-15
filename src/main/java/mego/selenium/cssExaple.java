package mego.selenium;

import mego.page_google_dog_test.pages.googleSearchPage;
import mego.pase_object_swagLabs.test.seleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class cssExaple {

    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.saucedemo.com/");
        WebElement user = driver.findElement(By.cssSelector("input[class*='input_error']"));
        user.sendKeys("hello");
        sleep(1000);

        base.seleniumClose(driver);
    }

}
