package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {
    WebDriver driver;


    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWebTitle(){
        return driver.getTitle();
    }
}
