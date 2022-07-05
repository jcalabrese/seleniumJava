package entryAd;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class EntryAdTests extends BaseTest {
    @Test
    public void testModal (){
        var entryAdPage  = homePage.clickEntryAd();

        assertTrue(entryAdPage.isModalDisplayed(),"Modal is not displayed");
//        tests fails needs to be added a wait.
        assertEquals(entryAdPage.getModalTitle(),"THIS IS A MODAL WINDOW","Modal title is not correct");

        assertEquals(entryAdPage.getModalContent(),
                "It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something or disable their ad blocker).",
                "Content is not correct");
        entryAdPage.closeModal();
        assertTrue(entryAdPage.isModalClosed(),"Modal is not closed");
    }
}
