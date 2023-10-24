package demo

import io.github.bonigarcia.wdm.WebDriverManager
import org.example.LoginPage
import org.junit.Test
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.testng.TestNG

public class ExeTest {
    static WebDriver driver;
    static TestNG testNg;

    @Test
    public void runTest() {
        String browserName = System.getProperty("driver.type") !=null ? System.getProperty("driver.type") : "chrome";
        if(browserName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("fireFox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if (browserName.equalsIgnoreCase('edge')){
            WebDriverManager.edgedriver().setup()
            driver = new EdgeDriver();
        }

//        System.out.println("printing from the Executable  ");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.goTo("https://rahulshettyacademy.com/AutomationPractice/");
        assert loginPage.getTitle() == "Practice Page";
        driver.quit();
    }
//    public static void main(String[] args) {
//      System.out.println("printing ");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.goTo("https://rahulshettyacademy.com/AutomationPractice/");
//        assert loginPage.getTitle() == "Practice Page";
//        driver.quit();

//        testNg = new TestNG();
//		testNg.setTestClasses(new Class[] {ExecutableTest.class});

//        String filePath = System.getProperty("user.dir")+"//testng.xml";
//        List<String> xmlList = new ArrayList<String>();
//        xmlList.add(filePath);
//        testNg.setTestSuites(xmlList);
//        testNg.run();


}
