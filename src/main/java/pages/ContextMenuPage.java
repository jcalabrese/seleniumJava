package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By contextMenuBox = By.id("hot-spot");


    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }
    public void rightClickContextMenuBox (){
         WebElement box =driver.findElement(contextMenuBox);
        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();


    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void closeAlert(){
        driver.switchTo().alert().accept();
    }
}
