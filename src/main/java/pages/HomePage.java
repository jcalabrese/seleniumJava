package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    //By locator
//    private By formAutaticationLink = By.linkText("Form Authentication");

    //method to interact to that link
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
//        driver.findElement(formAutaticationLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);

    }
    public DropdownPage clickDropdown(){
        clickLink("dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);

    }
    public HoversPage clickHovers () {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses () {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    private void clickLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();

    }

}
