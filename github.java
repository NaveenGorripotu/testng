import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class github {
    WebDriver driver;
//public static ChromeOptions options = new ChromeOptions();
//public static WebDriver driver = new ChromeDriver(options);

    @BeforeTest
    public void page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Test
    public void login(){
        driver.findElement(By.id("login_field")).sendKeys("naveengorripotu@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Naveen#2002");
        driver.findElement(By.name("commit")).click();

    }
     @Test
     public void search(){
       WebElement element = driver.findElement(By.xpath("//a[text()='Join Global Campus']"));
       element.click();
//       element.sendKeys("Naveen");
//       element.submit();
       //driver.close();
     }
}
