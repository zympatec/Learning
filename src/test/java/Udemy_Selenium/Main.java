//package Udemy_Selenium;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.time.Duration;
//import static org.junit.Assert.*;
//
//public class Main {
//
//    private WebDriver driver;
//    private String baseUrl;
//
//    @BeforeEach
//    public void SetUp() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        baseUrl = "https://vodohod.com";
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.manage().window().maximize();
//    }
//
//    @Test
//    public void Start() {
//        driver.get(baseUrl + "/");
//        assertEquals("Речные круизы по России в 2021 - 2022 году от компании «ВодоходЪ»",driver.getTitle());
//    }
//
//    @AfterEach
//    public void Finish() {
//        driver.quit();
//    }
//
//}