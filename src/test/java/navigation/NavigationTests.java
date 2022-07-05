package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NavigationTests extends BaseTest {
    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        homePage.clickDynamicLoading().clickExample2();

    }

    @Test
    public void testSwitchTab(){
        var multipleWindowsPage = homePage.clickMultipleWindows();
         multipleWindowsPage.clickHere();
         getWindowManager().switchToTab("New Window");

    }

    @Test
    public void testOpenWithRightClick(){
        var example1 = homePage.clickDynamicLoading().rightClickExample1();
        getWindowManager().switchToTabNumber(2);
        assertEquals(example1.getPageTitle(),"Dynamically Loaded Page Elements","Title is not correct");

    }
}
