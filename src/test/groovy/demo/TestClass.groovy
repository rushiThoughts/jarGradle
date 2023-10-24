
package demo

import io.github.bonigarcia.wdm.WebDriverManager
import org.example.LoginPage
import org.junit.Test
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver


class TestClass {
    static WebDriver driver;

    @Test
    public void landOnPage() {

        String browser = System.getProperty("browserName") !=null ? System.getProperty("browserName") : "Chrome";

        System.out.println("printing ");

        if(browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("fireFox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo("https://rahulshettyacademy.com/AutomationPractice/");
        Assert.assertEquals(loginPage.getTitle(), "Practice Page") ;
        driver.quit();

    }
}




