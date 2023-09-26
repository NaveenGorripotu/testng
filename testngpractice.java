import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testngpractice {
    @Test
    public void testgoogle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement text = driver.findElement(By.name("q"));
        text.sendKeys("Naveen");
        text.submit();
        String expectedTitle = "Naveen - Google Search";
        System.out.println(driver.getTitle());
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        Thread.sleep(3000);
        driver.quit();


    }
    @Test
    public void testfacebook() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement text = driver.findElement(By.id("email"));
        text.sendKeys("Naveen");
        text.submit();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }

}
