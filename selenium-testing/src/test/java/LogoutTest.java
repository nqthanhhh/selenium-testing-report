import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    void logoutSuccessfully() {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        driver.findElement(By.id("react-burger-menu-btn"))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("logout_sidebar_link")));

        driver.findElement(By.id("logout_sidebar_link"))
                .click();

        wait.until(ExpectedConditions.urlToBe(
                "https://www.saucedemo.com/"));

        Assertions.assertEquals(
                "https://www.saucedemo.com/",
                driver.getCurrentUrl());
    }

    @AfterEach
    void tearDown() throws InterruptedException {

        Thread.sleep(5000);

        driver.quit();
    }
}