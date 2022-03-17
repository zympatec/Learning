package TestNG19;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1Test {
    ExtentReports extent;

    @BeforeTest
    public void config(){
        String path = System.getProperty("user.dir") + "\\reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Results");
        reporter.config().setDocumentTitle("Test Resuts");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Daniyar");
    }

    @AfterTest
    public void LastExecution() {
        extent.createTest("LastExecution");
        System.out.println("last execution");
        extent.flush();
    }

    @Test
    public void Demo() {
        System.out.println("hi");
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("i am the last");
    }

    @Test
    public void SecondTest() {
        System.out.println("bye");
    }
}
