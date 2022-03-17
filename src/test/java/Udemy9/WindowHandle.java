package Udemy9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
        // открывается новое окно, нужно переключиться на него
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentid = it.next();
        String childid = it.next();

        driver.switchTo().window(childid);
        String mail = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].split("with")[0].trim();

        driver.switchTo().window(parentid);
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys(mail);
    }
}
