package base.logger;

// it works in case of falling test only

import base.tools.screenshotmaker.ScreenShotMaker;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        if (WebDriverRunner.driver() != null) {
            new ScreenShotMaker().createFullScreensot(WebDriverRunner.url());


        }
        ITestListener.super.onTestFailure(result);
        Logger.error("TEST FAILED! see method: " + result.getName());
    }
}
