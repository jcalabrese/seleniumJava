package keyPresses;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KeyPressesTests extends BaseTest {
    @Test
    public void TestBackSpace(){
        var keyPressesPage = homePage.clickKeyPresses();
        KeyPressesPage.Result result = keyPressesPage.setInputKeysField("A"+Keys.BACK_SPACE);
        assertTrue(result.isDisplayed(),"Result is not displayed");
        assertEquals(result.getResult(),"You entered: BACK_SPACE","Result is not correct");


    }
    @Test
    public void TestPi (){
        var keyPressesPage = homePage.clickKeyPresses();
        KeyPressesPage.Result result = keyPressesPage.setInputKeysField(Keys.chord(Keys.ALT,"p")+ "=3.14");
        assertTrue(result.isDisplayed(),"Result is not displayed");
        assertEquals(result.getResult(),"You entered: 4","Result is not correct");

    }
}
