package Udemy13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class ScrollingAndTableGrids {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        // скролл до таблицы
        js.executeScript("window.scrollBy(0,500)");
        // скролл внутри таблицы вниз
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        
        List<WebElement> columnFour = driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
        int sum = 0;
        for (int i = 0; i < columnFour.size(); i++) {
            sum += Integer.parseInt(columnFour.get(i).getText());
        }
        System.out.println(sum);
        String[] total = driver.findElement(By.cssSelector(".totalAmount")).getText().split(" ");
        Assert.assertEquals(String.valueOf(sum), total[total.length - 1]);

    }
}
