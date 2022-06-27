package hover;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTest {

    @Test
    public void testSuccesfulHover(){
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption figureCaption = hoversPage.hoverOverFigures(1);
        assertTrue(figureCaption.isCaptionDisplayed(),"Caption is nos displlayed");
        assertEquals(figureCaption.getHeaderText(),"name: user1","Caption Title is incorrect");
        assertEquals(figureCaption.getLinkText(),"View profile","Link text is incorrect");
        assertEquals(figureCaption.getLink(),"https://the-internet.herokuapp.com/users/1","link is incorrect");

    }

}
