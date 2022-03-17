package Udemy9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PractiseUdemy12 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
        String label = driver.findElement(By.xpath("//label[@for='benz']")).getText();
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select s = new Select(dropdown);
        s.selectByVisibleText(label);
        driver.findElement(By.id("name")).sendKeys(label);
        driver.findElement(By.id("alertbtn")).click();
        if (driver.switchTo().alert().getText() == String.format("Hello %s, share this practice page and share your knowledge", label)) {
            Assert.assertTrue(true);
        } else
        {
            Assert.assertFalse(false);
        }

        driver.switchTo().alert().accept();
    }
}
