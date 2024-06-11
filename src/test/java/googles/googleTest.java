package googles;

import org.example.ResultPage;
import org.example.SearchPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class googleTest {


 WebDriver driver ;

 @Before
    public void setUp(){
     driver = new ChromeDriver();
     driver.get("https://www.google.com");
 }

 @Test
    public void driverTest(){
     SearchPage searchPage = new SearchPage(this.driver);
     searchPage.setSearch_bar("UGM" + Keys.ENTER);
//     ResultPage resultPage = searchPage.click_search();
     String title = driver.getTitle();
     Assertions.assertTrue(title.contains("UGM"));
 }
}
