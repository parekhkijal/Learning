package nz.co.datacom.automation.common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerAndReader {
    public static String PROJECT_PATH = System.getProperty("user.dir");
    public static String OS_SEPARATOR = File.separator;
    public static String LOG_PATH;
    public static String LOG_FILE_NAME;

    static Date dt = new Date();
    static SimpleDateFormat folderNameSf = new SimpleDateFormat("MMM_dd_yyyy");
    static SimpleDateFormat resultFileNameSf = new SimpleDateFormat("hh_mm_ss");

    public LoggerAndReader() {
    }

    private static String createFolder(String folderPathName) {
        folderPathName = folderPathName + OS_SEPARATOR + folderNameSf.format(dt);
        File file = new File(folderPathName);
        boolean exists = file.exists();
        if (!exists) {
            file.mkdir();
        }
        return folderPathName;
    }

    private static void createFile(String filePathName) throws IOException {
        File file = new File(filePathName);
        boolean exists = file.exists();
        if (!exists) {
            file.createNewFile();
        }
    }

    public void createLogsFolderAndFile() {
        try {
            LOG_PATH = PROJECT_PATH + OS_SEPARATOR + "logs";
            LOG_PATH = createFolder(LOG_PATH);
            LOG_FILE_NAME = LOG_PATH + OS_SEPARATOR + "AutomationLog_" + resultFileNameSf.format(dt) + ".log";
            createFile(LOG_FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}