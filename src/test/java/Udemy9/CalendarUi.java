package Udemy9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CalendarUi {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions/");
        driver.findElement(By.xpath("//input[@id='travel_date']")).click();
        // 28 march 2022
        while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("March")) {
            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }
        List<WebElement> dates = driver.findElements(By.className("day"));
        for (int i = 0; i < dates.size(); i++) {
            if (dates.get(i).getText().equalsIgnoreCase("28")) {
                dates.get(i).click();
                break;
            }
        }
    }
}