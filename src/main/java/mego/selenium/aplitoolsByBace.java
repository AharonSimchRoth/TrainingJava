package mego.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class aplitoolsByBace {
    public static void main(String[] args) {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = seleniumBase.seleniumInit( "https://www.ebay.com/");



        base.seleniumClose(driver);
    }

}
