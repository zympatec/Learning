package Udemy9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseSynchronization {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
        WebDriverWait w = new WebDriverWait(driver, 5);

        driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
        System.out.println(driver.findElement(By.xpath("//div[@id='results']")));
    }
}
