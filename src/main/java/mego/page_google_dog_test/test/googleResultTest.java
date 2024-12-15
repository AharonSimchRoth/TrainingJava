package mego.page_google_dog_test.test;

import mego.page_google_dog_test.pages.googleResultPage;
import mego.page_google_dog_test.pages.googleSearchPage;
import mego.pase_object_swagLabs.test.seleniumBase;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleResultTest {
    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www.google.com/");

        googleSearchPage googleSearchPage = new googleSearchPage(driver);
        googleSearchPage.typeInToSearct("dog");

        googleResultPage googleResultPage = new googleResultPage(driver);
        googleResultPage.getResulte();

        base.seleniumClose(driver);
    }
}
