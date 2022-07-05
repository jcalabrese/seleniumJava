package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;
    public String linkXpath_Format = ".//a[contains(text(),'%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format,"Example 1"));
//    private By linkExample1 = By.linkText("Example 1: Element on page that is hidden");
    private By link_Example2 = By.xpath(String.format(linkXpath_Format,"Example 2"));

    public DynamicLoadingPage (WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }



    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample1Page rightClickExample1(){
        WebElement link = driver.findElement(link_Example1);
        Actions action = new Actions(driver);
        action.contextClick(link).perform();
        return new DynamicLoadingExample1Page(driver);

    }

}
