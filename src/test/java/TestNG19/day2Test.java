package TestNG19;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2Test {
    @Test (groups = {"Smoke"})
    public void PLoan() {
        System.out.println("hey");
    }

    @BeforeTest
    public void Prerequisite() {
        System.out.println("execute first");
    }
}
