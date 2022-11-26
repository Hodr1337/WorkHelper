import com.nylas.RequestFailedException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class TrySkype {

    public static void main() throws InterruptedException, RequestFailedException, IOException {
        System.setProperty("webdriver.chrome.driver", "D:\\WorkHelp\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://web.skype.com/");
        WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
        username.sendKeys("fornymbus@gmail.com");
        WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();
        Password.sendKeys("AndreiPassword1*");
       // Password.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        WebElement button2 = driver.findElement(By.xpath("//input[@type='submit']"));
        button2.click();
        Thread.sleep(1000);
        WebElement button3 = driver.findElement(By.xpath("//input[@type='submit']"));
        button3.click();
        Thread.sleep(10000);
        WebElement SelectPerson = driver.findElement(By.xpath("//div[@data-text-as-pseudo-element='Andrii Tkachenko']"));
        SelectPerson.click();
        Thread.sleep(2000);
        WebElement callButton = driver.findElement(By.xpath("//button[@title='Аудіовиклик']"));
        callButton.click();
        Thread.sleep(20000);
        WebElement AcceptCall = driver.findElement(By.xpath("//button[@title='Продовжити без звуку або відео']"));
        AcceptCall.click();

    }
}