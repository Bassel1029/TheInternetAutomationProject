package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextMenuTests extends BaseTests {

    @Test
    public void TestContextMenu(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickBox();
        String msg = contextMenuPage.getAlertText();
        contextMenuPage.alertAccept();
        assertEquals(msg,"You selected a context menu","Wrong msg!");
    }
}
