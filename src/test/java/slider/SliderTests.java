package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SliderTests extends BaseTests {

    @Test
    public void SliderMoveTest() {
        var horizontalSlider = homePage.clickHorizontalSlider();
        double desiredPosition = 4;
        horizontalSlider.moveSlider(desiredPosition);
        assertEquals(horizontalSlider.getSliderPosition(), "4", "Wrong position!!");
        }
    }


