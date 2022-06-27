package forgotPasswordTest;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTest  extends BaseTest {

    @Test
    public void testSuccessfulForgotPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("hola@example.com");
        EmailSentPage emailSentPage = forgotPasswordPage.retrievePassword();
        assertEquals(emailSentPage.getEmailSentLegend(),"Your e-mail's been sent!");
    }

}
