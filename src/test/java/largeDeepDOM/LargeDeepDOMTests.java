package largeDeepDOM;

import base.BaseTest;
import org.testng.annotations.Test;

public class LargeDeepDOMTests extends BaseTest {
    @Test
    public void ScrollToTable (){
        var largeDeepDomPage = homePage.clickLargeDeepDOM();
        largeDeepDomPage.scrollToTable();

    }
}
