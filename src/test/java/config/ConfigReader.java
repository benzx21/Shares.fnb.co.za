package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {


    public static void PopulateSettings()  {
        ConfigReader reader = new ConfigReader();
        try {
            reader.ReadProperty();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ReadProperty() throws IOException {
        //Create Property Object
        Properties p = new Properties();
        InputStream inputStream = new FileInputStream("src/test/java/config/GlobalConfig.properties");
        p.load(inputStream);

        Settings.BrowserName = p.getProperty("BrowserName");
        Settings.Headless = Boolean.getBoolean(p.getProperty("Headless"));
        Settings.DevTools =Boolean.getBoolean(p.getProperty("DevTools"));
        Settings.DeviceEmulationType = p.getProperty("DeviceEmulationType");
        Settings.Locale = p.getProperty("Locale");

    }

}
