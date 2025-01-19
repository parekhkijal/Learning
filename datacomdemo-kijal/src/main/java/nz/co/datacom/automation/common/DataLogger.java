package nz.co.datacom.automation.common;

import org.apache.log4j.*;
import org.testng.Reporter;

public final class DataLogger {
    static LoggerAndReader loggerAndReader = new LoggerAndReader();
    static FileAppender appender = new FileAppender();
    private static Logger logger;

    public DataLogger(Class obj) {
        logger = LogManager.getLogger(obj);

        loggerAndReader.createLogsFolderAndFile();

        appender.setFile(LoggerAndReader.LOG_FILE_NAME);
        appender.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
        appender.setAppend(true);
        appender.setThreshold(Level.INFO);
        appender.activateOptions();
        BasicConfigurator.configure(appender);
    }

    public void Info(String message) {
        if (logger.isEnabledFor(Level.INFO)) {
            logger.log(Level.INFO, message);
            Reporter.log(message);
        }
    }
}