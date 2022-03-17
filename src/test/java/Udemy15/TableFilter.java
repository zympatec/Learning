package Udemy15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class TableFilter {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> firstColumn = driver.findElements(By.xpath("//tr/td[1]"));
        List<WebElement> filteredList = firstColumn.stream().filter(s -> s.getText().contains("Rice"))
                .collect(Collectors.toList());
        Assert.assertEquals(firstColumn.size(), filteredList.size());
    }
}
