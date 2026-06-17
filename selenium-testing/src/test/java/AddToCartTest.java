import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTest {

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void addProductToCart() {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        String cartBadge = driver.findElement(
                        By.className("shopping_cart_badge"))
                .getText();

        Assertions.assertEquals("1", cartBadge);
    }

    @AfterEach
    void tearDown() throws InterruptedException {

        Thread.sleep(5000);

        driver.quit();
    }
}