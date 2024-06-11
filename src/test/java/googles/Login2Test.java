package googles;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login2Test {
    @Test
    public void test(){
        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.firefox.driver", "D:\\TechStuff\\geckodriver-v0.34.0-win64");
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");

        WebElement login = driver.findElement(By.id("submit"));
        login.click();

        String ExpectedURL = "https://practicetestautomation.com/logged-in-successfully/";
        String ActualURL = driver.getCurrentUrl();
        Assert.assertEquals(ExpectedURL, ActualURL);

//        WebElement text = driver.findElement(By.xpath("//*[contains(text(), 'products')]"));

    }
}
