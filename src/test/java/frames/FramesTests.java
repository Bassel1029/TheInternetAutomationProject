package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {

    @Test
    public void TestingFramesPage(){
        var nestedFramesPage = homePage.clickFrames().clickNestedFrames();
        assertEquals(nestedFramesPage.getTextFromLeft(),"LEFT","Incorrect left text!");
        assertEquals(nestedFramesPage.getTextFromBottom(),"BOTTOM","Incorrect bottom text!");
    }
}
