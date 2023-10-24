package org.example

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class Demo {
    static WebDriver driver

    public static void main(String[] args) {

           println("printing ..")
           WebDriverManager.chromedriver().setup()
           driver = new ChromeDriver()
           driver.manage().window().maximize()

           LoginPage loginPage = new LoginPage(driver)
           loginPage.goTo("https://rahulshettyacademy.com/AutomationPractice/")
           assert loginPage.getTitle() == "Practice Page"
           driver.quit()

       }

}
