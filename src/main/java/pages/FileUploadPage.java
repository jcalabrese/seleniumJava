package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;

    private By fileUploadInput = By.id("file-upload");
    private By uploadBtn = By.id("file-submit");



    public FileUploadPage (WebDriver driver){
        this.driver = driver;
    }

    public UploadPage uploadFile (String absolutePathFile){
        driver.findElement(fileUploadInput).sendKeys(absolutePathFile);
        clickUploadBtn();
        return new UploadPage(driver);
    }

    public void clickUploadBtn(){
        driver.findElement(uploadBtn).click();
    }



    public class UploadPage{

        private WebDriver driver;
        public By legend = By.tagName("h3");
        public By uploadedFileName = By.id("uploaded-files");

        public UploadPage(WebDriver driver){
            this.driver = driver;

        }

        public String getLegend (){
            return driver.findElement(legend).getText();
        }

        public String getUploadedFileName (){
            return driver.findElement(uploadedFileName).getText();
        }


    }
}
