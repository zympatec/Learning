package Udemy15;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class TableSortingPagination {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> firstColumn = driver.findElements(By.xpath("//tr/td[1]"));
        List<String> originalList = firstColumn.stream().map(s -> s.getText()).collect(Collectors.toList());
        List<String> sortedList =originalList.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(originalList.equals(sortedList));

        List<String> price;
        //pagination
        do {
            List<WebElement> firstColumn1 = driver.findElements(By.xpath("//tr/td[1]"));
            price = firstColumn1.stream().filter(s -> s.getText().contains("Rice"))
                    .map(s -> getPrice(s))
                 .collect(Collectors.toList());
             if (!(price.size() > 0)) {
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        } while (!(price.size() > 0));
        price.forEach(s -> System.out.println(s));
    }
    private static String getPrice(WebElement s) {
        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }
}
