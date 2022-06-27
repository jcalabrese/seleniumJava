package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By result = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }



    public Result setInputKeysField(String text){
        driver.findElement(inputField).sendKeys(text);

         return new Result(driver.findElement(result));

    }


    public class Result{
        private WebElement result;

        public  Result (WebElement result){
            this.result=result;
        }
        public Boolean isDisplayed(){
          return  result.isDisplayed();
        }
        public String getResult(){
            return result.getText();
        }



    }
}
