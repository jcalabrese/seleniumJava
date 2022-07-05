package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;


public class BaseTest {
    //before any of our test clases run
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        goHome();
        homePage = new HomePage(driver);



    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");

    }

    @AfterClass
    public void TearDdown(){
        driver.quit();
    }
//testng knows what we need to run ??

//public static void main (String args[]){
//    BaseTest test = new BaseTest();
//    test.setUp();
//
//}
}
