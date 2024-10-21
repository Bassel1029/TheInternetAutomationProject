package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertsTests extends BaseTests {
    @Test
    public void JSAlertTest(){
    var JSAlertsPage = homePage.clickJavascriptAlert();
    JSAlertsPage.clickAlertButton();
    JSAlertsPage.acceptAlert();
    assertEquals(JSAlertsPage.getAlertMsg(),"You successfully clicked an alert","Wrong alert!");
    }

    @Test
    public void getTestFromAlert(){
    var JSAlertsPage = homePage.clickJavascriptAlert();
    JSAlertsPage.clickConfirmButton();
    String msg = JSAlertsPage.getMsgForConfirmButton();
    JSAlertsPage.dismissAlert();
    assertEquals(msg,"I am a JS Confirm","Wrong msg!");
    }

    @Test
    public void promptTest(){
        var alertsPage = homePage.clickJavascriptAlert();
        alertsPage.clickPromptButton();
        String msg = "Hi there!";
        alertsPage.sendPrompt(msg);
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getAlertMsg(),"You entered: " + msg,"Wrong message!");
    }
}
