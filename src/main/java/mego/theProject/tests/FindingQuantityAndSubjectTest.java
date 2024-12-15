package mego.theProject.tests;

import mego.pase_object_swagLabs.test.seleniumBase;
import mego.theProject.pages.FindingQuantityAndSubject;
import mego.theProject.pages.TopicSearch;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FindingQuantityAndSubjectTest {
    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www2.kolhalashon.com/#/");

        TopicSearch HanukkahTopicSearch = new TopicSearch(driver);
        FindingQuantityAndSubject FindingQuantityAndSubject = new FindingQuantityAndSubject(driver);

        HanukkahTopicSearch.InputInToSearct("Hanukkah");
        FindingQuantityAndSubject.checkQuantityAndSubject("Hanukkah");


        sleep(5000);



        base.seleniumClose(driver);



    }
}
