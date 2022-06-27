package horizontalSlider;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTest {
    @Test
    public void testHorizontalslider (){
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.setSlider(8);
        assertEquals(horizontalSliderPage.getRange(),"4","Range is not correct");
    }
}
