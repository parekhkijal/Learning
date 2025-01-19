package nz.co.datacom.automation.common;

import org.openqa.selenium.WebDriver;

public class SeleniumHelper extends GenericFunctions {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        SeleniumHelper.driver = driver;
    }
}
