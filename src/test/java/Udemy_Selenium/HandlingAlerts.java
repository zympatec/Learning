package Udemy_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingAlerts {
        public static void main(String[] args) {
            String text = "Daniyar";

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            // Javascript alerts
            driver.findElement(By.xpath("//input[@id='name']")).sendKeys(text);
            driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

            if (driver.switchTo().alert().getText() == "Hello Daniyar, share this practice page and share your knowledge")
            {
                Assert.assertTrue(true);
            } else
            {
                Assert.assertFalse(false);
            }

            driver.switchTo().alert().accept();

            // Если есть две кнопки Ок и Отменить
            driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
            driver.switchTo().alert().dismiss();
        }
}
