package steps;

import com.microsoft.playwright.Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.FrameworkConfig;
import utilities.FrameworkInitialize;

import java.nio.file.Path;

public class HooksClass {
    @Before
    public void setUp(){
        FrameworkConfig.LocalPage = new FrameworkInitialize().initializePlaywright();
    }
    @After
    public void After(Scenario scenario){
        Page.ScreenshotOptions screenshotOptions = new Page.ScreenshotOptions();
        if(scenario.isFailed()){
            FrameworkConfig.LocalPage.screenshot(screenshotOptions.setPath(Path.of("./snaps/src.png","src/test/resources/screenshots.png" )));
        }

        FrameworkConfig.LocalPage.close();
        FrameworkConfig.LocalPage.close();
    }
}
