package TestNG19;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("successfully executed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

    }
}
