package hovers;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoversTests extends BaseTests {

    @Test
    public void HoversTesting(){
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption figureCaption = hoversPage.hoverOverFigure(1);
        assertEquals(figureCaption.getTitle(),"name: user1","Wrong Title");
        assertTrue(figureCaption.captionDisplayed(),"Caption not displayed");
        assertEquals(figureCaption.getLinkText(),"View profile","Caption Link Text Error");
        assertTrue(figureCaption.getLink().endsWith("/users/1"),"Link incorrect");
    }
}
