package Udemy_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestiveDropdowns {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // autosuggestive - появляются, когда вводишь текст (н-р, выбор страны)
        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // появилось три варианта, когда мы ввели ind
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
//        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        // выбираем ВСЕ элементы, которы появляются в списке
//      Проходим через все элементы списка
        for (WebElement option: options) {
            if (option.getText().equalsIgnoreCase("india")) {
                option.click();
                break;
            }
        }
    }
}
