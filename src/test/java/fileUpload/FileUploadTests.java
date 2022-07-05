package fileUpload;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {

    @Test
    public void testFileUpload (){
        var fileUploadPage =  homePage.clickFileUpload();
        var uploadPage =fileUploadPage.uploadFile("/Users/solangejazmincalabrese/IdeaProjects/Selenium/resources/chromedriver");
        assertEquals(uploadPage.getLegend(),"File Uploaded!","Uploaded success message is not correct");
        assertEquals(uploadPage.getUploadedFileName(),"chromedriver","File name is not correct");

    }
}
