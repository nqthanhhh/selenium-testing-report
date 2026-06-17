import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void loginSuccessfully() {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        Assertions.assertTrue(
                driver.getCurrentUrl().contains("inventory.html"));
    }

    @AfterEach
    void tearDown() throws InterruptedException {

        Thread.sleep(5000); // Giữ trình duyệt mở 5 giây

        driver.quit();
    }
}