package Udemy13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseTables {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.cssSelector("table[name='courses'] tr")).size());
        System.out.println(driver.findElements(By.cssSelector("table[name='courses'] tr:nth-child(1) th")).size());
        System.out.println(driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3)")).getText());
    }
}
