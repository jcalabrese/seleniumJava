package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DynamicLoadingExample1Page {
    private WebDriver driver;
    private By startBtn = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");
    private By pageTitle = By.tagName("h3");
    public DynamicLoadingExample1Page (WebDriver driver){
        this.driver = driver;
    }
    public void clickStart(){
        driver.findElement(startBtn).click();

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5) );
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        FluentWait wait1 = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait1.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }

    public String getPageTitle (){
        return driver.findElement(pageTitle).getText();
    }


}
