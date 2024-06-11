package googles;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    @Test
    public void test() {
        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.firefox.driver", "D:\\TechStuff\\geckodriver-v0.34.0-win64");
        driver.manage().window().maximize();
        driver.get("https://sv.ugm.ac.id/");
        String title = driver.getTitle();
        System.out.println(title);

        driver.quit();
    }
}
