package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYEditorPage {
    private WebDriver driver;
    private String editorIframeId  = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.
            cssSelector("button[title='Decrease indent']");
    public WYSIWYEditorPage(WebDriver driver){
        this.driver = driver;
    }
    private void switchToEditArea(){
        driver.switchTo().

                frame(editorIframeId);
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();

    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void setTextInTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void decreaseIndent(){
        driver.findElement(decreaseIndentButton).click();
    }

    public String getTextAreaText (){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
