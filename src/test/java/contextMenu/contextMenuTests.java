package contextMenu;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class contextMenuTests extends BaseTest {
    @Test
    public void testContextMenu(){
        var contextMenuPage =  homePage.clickContextMenu();
        contextMenuPage.rightClickContextMenuBox();
        assertEquals(
        contextMenuPage.getAlertText(),
                "You selected a context menu",
                "Alert Message is not correct");
        contextMenuPage.closeAlert();
    }
}
