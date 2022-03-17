package Udemy9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ScopeAndLinks {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        // links count on the page
        System.out.println(driver.findElements(By.tagName("a")).size());
        // links count in the footer
//        System.out.println(driver.findElements(By.cssSelector("div[id='gf-BIG'] a")).size());
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerDriver.findElements(By.cssSelector("a")).size());
        // count first column links in footer
        WebElement fistColumnDriver = footerDriver.findElement(By.xpath("//td[1]/ul"));
        System.out.println(fistColumnDriver.findElements(By.tagName("a")).size());
        // click on each link in the 1st column and check if pages are opening
        for (int i = 1; i < fistColumnDriver.findElements(By.tagName("a")).size(); i++) {
            String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            fistColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
        }
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }





    }
}
