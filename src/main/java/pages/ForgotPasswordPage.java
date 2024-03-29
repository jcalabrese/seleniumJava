package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordBtn = By.id("form-submit");


    public ForgotPasswordPage (WebDriver driver){
        this.driver=driver;
    }
    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage retrievePassword (){
        driver.findElement(retrievePasswordBtn).click();
        return  new EmailSentPage(driver);
    }
}
