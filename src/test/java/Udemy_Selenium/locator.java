package Udemy_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://facebook.com");
        driver.findElement(By.id("email")).sendKeys("email");
        driver.findElement(By.name("pass")).sendKeys("123456");
//        driver.findElement(By.linkText("Забыли пароль?")).click();
//        driver.findElement(By.xpath("//*[@id='u_0_d_L7']")).click();
//        driver.findElement(By.name("login")).click();
//        driver.findElement(By.xpath("//button[@name='login']")).click(); // копируем html и по уникальному атрибуту делаем, после // идет тэг

        driver.findElement(By.xpath("//div[@class='_6luv _52jv']/form/div[2]/button")).click(); //через parent-child
//        System.out.println(driver.findElement(By.xpath("//*[@id='email_container']/div[2]")).getText());
    }
}