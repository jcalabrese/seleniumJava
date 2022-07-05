package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EntryAdPage {
    private WebDriver driver;
    private By modalWindow = By.id("modal");
    private By modal_title = By.cssSelector(".modal-title>h3");
    private By modal_content = By.cssSelector(".modal-body p");
    private By modal_closeBtn = By.cssSelector(".modal-footer p");


    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }
    public String getModalTitle(){
        return driver.findElement(modal_title).getText();

    }


    public String getModalContent (){
        return driver.findElement(modal_content).getText();
    }

    public void closeModal () {
        driver.findElement(modal_closeBtn).click();
    }

    public Boolean isModalClosed(){
        var style= driver.findElement(modalWindow).getAttribute("style");
        System.out.println(style);
        return style.equals("display: none;") ;
    }
    public Boolean isModalDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.attributeContains(driver.findElement(modalWindow),"style","block"));

        var style= driver.findElement(modalWindow).getAttribute("style");
        return style.equals("display: block;") ;
    }
}

