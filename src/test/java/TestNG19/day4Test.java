package TestNG19;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class day4Test {

    private static Logger log = LogManager.getLogger(day1Test.class.getName());

    @Test
    public void WebLoginHomeLoan() {
        System.out.println("WebLoginHomeLoan");

        log.debug("i am debbuging");
        if (true) {
            log.info("obj is present");
        } else {
            log.error("obj is not present");
        }
        log.fatal("this is fatal");
    }

    @Test (groups = {"Smoke"})
    public void MobileLoginHomeLoan() {
        System.out.println("MobileLoginHomeLoan");
    }

    @Test (groups = {"Smoke"})
    public void LoginAPIHomeLoan() {
        System.out.println("LoginAPIHomeLoan");
    }
}
