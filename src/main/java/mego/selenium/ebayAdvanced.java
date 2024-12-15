package mego.selenium;

import com.beust.ah.A;
import com.sun.jna.Structure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class ebayAdvanced {
    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = seleniumBase.seleniumInit( "https://www.ebay.com/");


        WebElement Advanced = driver.findElement(By.id("gh-as-a"));

        Advanced.click();

        WebElement dropDownCategory = driver.findElement(By.name("_in_kw"));
        Select categories = new Select (dropDownCategory);
        categories.selectByIndex(2);
        sleep(3000);

        WebElement checkbox = driver.findElement(By.name("LH_TitleDesc"));
        checkbox.click();

        WebElement search = driver.findElement(By.className("btn btn--primary"));
        search.click();






        base.seleniumClose(driver);
    }
}
