package Udemy_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DynamicDropdowns {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // Динамические списки - формируются на основе действий пользователя
        // (Чтобы в html появились варианты списка - нужно его сначала открыть, иначе они не отображаются)
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        // вообще тут через индексы [2] делается, но работает так почему-то
//        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // а это через родителя, в котором child xpath
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

    }
}
