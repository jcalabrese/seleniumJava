package dynamicLoading;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTest {
    @Test
    public void testExample1 (){
        var DynamicLoadingPage = homePage.clickDynamicLoading();
        var Example1Page = DynamicLoadingPage.clickExample1();
        Example1Page.clickStart();
        assertEquals(Example1Page.getLoadedText(),"Hello World!","Loaded text is not correct");
    }
    @Test
    public void testExample2(){
        var DynamicLoadingPage = homePage.clickDynamicLoading();
        var Example2Page = DynamicLoadingPage.clickExample2();
        Example2Page.clickStart();
        assertEquals(Example2Page.getMessage(),"Hello World!","Message is not correct");
    }
}
