package Udemy_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Practise2 {
        public static void main(String[] args) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.cleartrip.com/");

//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            driver.findElement(By.xpath("//div[@class='mb-4']/select[1]")).click();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            WebElement staticDropdownAdults = driver.findElement(By.xpath("//div[@class='mb-4']/select[1]"));
            Select dropdownAdults = new Select(staticDropdownAdults);
            dropdownAdults.selectByIndex(3);

            driver.findElement(By.xpath("//div[@class='mb-4']/following_sibling::div[1]/select[1]")).click();
            WebElement staticDropdownChildren = driver.findElement(By.xpath("//div[@class='mb-4']/following_sibling::div[1]/select[1]"));
            Select dropdownChildren = new Select(staticDropdownChildren);
            dropdownChildren.selectByIndex(3);

            driver.findElement(By.xpath("//button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']")).click();
            driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--leftEdge DayPicker-Day--selected DayPicker-Day--today']")).click();

            driver.findElement(By.xpath("//a[@class='td-none hover:td-underline px-4 mt-1 weak']")).click();

            driver.findElement(By.xpath("//input[@class='field bw-1 bs-solid w-100p p-2 box-border br-4 fs-2 c-neutral-900 h-8 bc-neutral-100 c-neutral-900 focus:bc-secondary-500 flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-secondary-500 pr-2 pl-3 pt-2 pb-2 ba br-4 h-8']")).sendKeys("dan");
        }
}
