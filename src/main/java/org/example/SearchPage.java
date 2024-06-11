package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    private By search_bar = new By.ById("APjFqb");
    private By button = new By.ByName("btnK");

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSearch_bar(String q){
        driver.findElement(search_bar).sendKeys(q);
    }

    public ResultPage click_search(){
        driver.findElement(button).click();
        return new ResultPage(driver);
    }
}
