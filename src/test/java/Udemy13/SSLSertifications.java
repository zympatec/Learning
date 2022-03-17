package Udemy13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLSertifications {
    public static void main(String[] args) {
        ChromeOptions c = new ChromeOptions();
        c.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(c);
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
    }
}
