package javaScriptAlerts;

import base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class JavaScriptAlertsTests extends BaseTest {


    @Test
    public void testJavaScriptAlert(){
        var javaSriptAlertPage = homePage.clickJavaScriptAlerts();
        javaSriptAlertPage.triggerAlert();
        javaSriptAlertPage.alert_clickToAccept();
        assertEquals(javaSriptAlertPage.getResult(),"You successfully clicked an alert","Result is not correct");
    }

    @Test
    public void testConfirmAlert(){
        var javaSriptAlertPage = homePage.clickJavaScriptAlerts();
        javaSriptAlertPage.triggerConfirm();
        assertEquals(javaSriptAlertPage.alert_getMessage(),"I am a JS Confirm","Confirm message is not correct");
        javaSriptAlertPage.alert_clickToCancel();
        assertEquals(javaSriptAlertPage.getResult(),"You clicked: Cancel","Result is not correct");
    }

    @Test
    public void testAddTextPromptAlert(){
        var javaSriptAlertPage = homePage.clickJavaScriptAlerts();
        javaSriptAlertPage.triggerPrompt();
        assertEquals(javaSriptAlertPage.alert_getMessage(),"I am a JS prompt","Alert message is not correct");
         String text = "Hola!";
        javaSriptAlertPage.alert_setText(text);
        javaSriptAlertPage.alert_clickToAccept();
        assertEquals(javaSriptAlertPage.getResult(),"You entered: "+text,"Result is not correct");


    }
}
