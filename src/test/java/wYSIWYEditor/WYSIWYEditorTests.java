package wYSIWYEditor;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class WYSIWYEditorTests extends BaseTest {
    @Test
    public void testEditor(){
        var editorPage = homePage.clickWYSIWYGEditor();
        editorPage.clearTextArea();
        editorPage.setTextInTextArea("Hello");
        assertEquals(editorPage.getTextAreaText(),"Hello","Text from editor is not correct");
        editorPage.decreaseIndent();
        editorPage.setTextInTextArea(" and bye");
        assertEquals(editorPage.getTextAreaText(),"Hello and bye","Text from editor is not correct");

    }


}
