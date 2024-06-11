package googles;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
    @Test

    public void test() {
        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.firefox.driver", "D:\\TechStuff\\geckodriver-v0.34.0-win64");
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.name("user-name"));
        username.clear();
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("secret_sauce");

        WebElement login=driver.findElement(By.name("login-button"));
        login.click();

        WebElement atc=driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        atc.click();

        WebElement shopcart=driver.findElement(By.className("shopping_cart_link"));
        shopcart.click();


        }
}
