package nz.co.datacom.automation.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonClassLib {

    private static CommonClassLib commonClassLib;
    public Properties props = null;

    public CommonClassLib() {
    }

    public static CommonClassLib getInstance() {
        if (commonClassLib == null) {
            commonClassLib = new CommonClassLib();
        }
        return commonClassLib;
    }

    public Properties setPropertiesFile() {
        props = new Properties();
        try {
            props.load(new FileInputStream(System.getProperty("user.dir") + "/datafiles/project.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }

}