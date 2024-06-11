package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ResultPage;
import org.example.SearchPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSteps {
    WebDriver driver;
    void setupChromeDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("user is on the search page")
    public void navigateToSearchPage() {
        setupChromeDriver();
        driver.get("https://www.google.com/");
    }
    @When("user search a valid query")
    public void submitQuery() throws InterruptedException {
        SearchPage q = new SearchPage(driver);
        q.setSearch_bar("UGM" + Keys.ENTER);

    }
    @Then("user should be redirected to the result page")
    public void searchSuccessful() throws InterruptedException {
        ResultPage result = new ResultPage(driver);
        String title = driver.getTitle();
        Assertions.assertTrue(title.contains("UGM"));

    }
    @After()
    public void closeBrowser() {
        driver.quit();
    }
}
