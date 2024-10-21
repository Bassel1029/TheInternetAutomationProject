package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UploadTests extends BaseTests {
    @Test
    public void UploadFileTest(){
        var uploadTests = homePage.clickUploadFile();
        uploadTests.uploadFile("C:/Users/Bassel Fawzi/OneDrive/Desktop/istqb/ISTQB-CTFL-AT_Syllabus_v1.0.pdf");
        assertEquals(uploadTests.getUploadedFileName(),"ISTQB-CTFL-AT_Syllabus_v1.0.pdf","Wrong file name!");
    }
}
