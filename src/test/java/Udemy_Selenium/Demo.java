package Udemy_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

//        System.out.println(driver.getPageSource());

        driver.get("https://yahoo.com");
//        driver.navigate().back();
//        driver.navigate().forward();
        driver.close(); // закрывает текущее окно
//        driver.quit(); // закрывает все окна открытые селениумом
    }
}
