package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private WebDriver driver;
    private By triggerAlertBtn = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmBtn = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptBtn = By.xpath(".//button[text()='Click for JS Prompt']");
    private By result = By.id("result");
    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertBtn).click();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();

    }
    public String getResult(){
        return driver.findElement(result).getText();
    }


    public void triggerConfirm(){
        driver.findElement(triggerConfirmBtn).click();
    }
    public String alert_getMessage(){
        return driver.switchTo().alert().getText();
    }
    public void alert_clickToCancel(){
        driver.switchTo().alert().dismiss();
    }


    public void triggerPrompt(){
        driver.findElement(triggerPromptBtn).click();
    }

    public void alert_setText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

}
