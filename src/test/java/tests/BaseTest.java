package tests;

import driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    static Logger logger;
    @BeforeAll
    public static void setUpLogger() {
        logger = LogManager.getLogger("logger");
    }
    @BeforeEach
    public void warmUp() {
        logger.info("Test started");
    }
    @AfterEach
    public void tearsDown() {
        logger.info("Test ended");
        DriverSingleton.quit();
    }
}
