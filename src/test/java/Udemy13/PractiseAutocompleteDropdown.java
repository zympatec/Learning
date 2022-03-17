package Udemy13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class PractiseAutocompleteDropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("#autocomplete")).sendKeys("Rus");
        List<WebElement> countries = driver.findElements(By.cssSelector("ul[id='ui-id-1'] li div"));
        for (WebElement country: countries) {
            if (country.getText().equalsIgnoreCase("Russian Federation")) {
                country.click();
                break;
            }
        }
    }
}
