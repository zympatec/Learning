package Udemy_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Checkbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).isSelected());
        driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).isSelected();

        driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).click();
//      проверить, выбран ли чекбокс

        Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).isSelected());
        driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).isSelected();
//      Посчитать количество чекбоксов
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

    }
}
