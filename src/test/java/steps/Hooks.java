package steps;

import base.FrameworkConfig;
import base.FrameworkInitalize;
import config.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void Setup() {
        ConfigReader.PopulateSettings();
        FrameworkConfig.LocalPage = new FrameworkInitalize().InitializePlaywright();
    }

    @After
    public void cleanUp() throws Exception {
        FrameworkConfig.LocalPage.close();
        FrameworkConfig.Playwright.close();
    }
}
