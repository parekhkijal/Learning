package nz.co.datacom.automation.common;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class GenericFunctions {
    public static Properties props = CommonClassLib.getInstance().setPropertiesFile();

    public void initialiseBrowser() {
        SeleniumHelper.setDriver(new ChromeDriver());
    }
}