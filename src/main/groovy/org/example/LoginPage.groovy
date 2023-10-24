package org.example

import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class LoginPage {
    WebDriver driver

    LoginPage(WebDriver driver) {
        this.driver = driver
        PageFactory.initElements(driver, this)
    }
    public void goTo(String url) {
        driver.get(url)
    }

    String getTitle(){
        String title = driver.getTitle()
        return title
    }
}
