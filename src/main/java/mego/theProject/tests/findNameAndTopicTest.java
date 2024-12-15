package mego.theProject.tests;

import mego.pase_object_swagLabs.test.seleniumBase;
import mego.theProject.pages.TopicSearch;
import mego.theProject.pages.findNameAndTopic;
import org.openqa.selenium.chrome.ChromeDriver;

public class findNameAndTopicTest {

    public static void main(String[] args) throws InterruptedException {
        seleniumBase base = new seleniumBase();
        ChromeDriver driver = base.seleniumInit("https://www2.kolhalashon.com/#/");

        TopicSearch HanukkahTopicSearch = new TopicSearch(driver);
        findNameAndTopic findNameAndTopic = new findNameAndTopic(driver);

        HanukkahTopicSearch.InputInToSearct("Hanukkah");
        findNameAndTopic.findDetails("Hanukkah");



        base.seleniumClose(driver);



    }
}
