package infiniteScroll;

import base.BaseTest;
import org.testng.annotations.Test;

public class InfiniteScrollTests extends BaseTest {
    @Test
    public void testSrollToFifthParagraph(){
        var infiniteScrollPage = homePage.clickInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(5);
    }
}
