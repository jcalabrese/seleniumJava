package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {
    private WebDriver driver;
    private By startBtn = By.cssSelector("#start button");

    private By parent = By.className("example");
    private By message = By.id("finish");

    public DynamicLoadingExample2Page (WebDriver driver){
        this.driver = driver;

    }

    public void clickStart(){
        driver.findElement(startBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(driver.findElement(parent),driver.findElement(message)));
        wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(parent, message));


    }

    public String getMessage (){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
////        wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(driver.findElement(parent),driver.findElement(message)));
//        wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(parent, message));

        return driver.findElement(message).getText();
    }

}
