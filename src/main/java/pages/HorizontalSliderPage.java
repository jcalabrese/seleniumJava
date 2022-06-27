package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;

public class HorizontalSliderPage {
    private WebDriver driver;
//    private By sliderContainer = By.className(".sliderContainer");
    private By slider = By.cssSelector(".sliderContainer input");
    private By range = By.id("range");

    public  HorizontalSliderPage(WebDriver driver){
        this.driver=driver;
    }

    public void setSlider(Integer value){

//        String keys = "Keys.ARROW_RIGHT";

//        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        StringBuilder keys = new StringBuilder();
        for (int i = 0; i < value; i++) {
            keys.append(Keys.ARROW_RIGHT);
        }
        driver.findElement(slider).sendKeys(Keys.chord(keys));
    }

    public String getRange(){
        return driver.findElement(range).getText();
    }


}
