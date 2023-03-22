package com.qa.StepDef;

import com.qa.pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.OutputType;
import utils.DriverManager;
import utils.GlobalParams;
import utils.ServerManager;
import utils.VideoManager;

import java.io.IOException;

public class Hooks {
    @Before
    public void initialize() throws Exception {

        BasePage basePage = new BasePage();
        basePage.closeApp();
        basePage.launchApp();

       /* GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();

        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
                + params.getDeviceName());

        new ServerManager().startServer();
        new DriverManager().initializeDriver();;
    }*/
    }
        @After
        public void quit (Scenario scenario) throws IOException {
            if (scenario.isFailed()) {
                byte[] screenshot = new DriverManager().getDriver().getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            }

            new VideoManager().stopRecording(scenario.getName());
        }
    }


