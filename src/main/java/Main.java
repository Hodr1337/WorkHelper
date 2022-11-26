import com.nylas.NylasAccount;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nylas.RequestFailedException;
import com.nylas.NylasClient;

import java.io.IOException;
import java.time.Duration;

public class Main {
    public static ApiClient apiClient;
    public static TrySkype trySkype;
    public static void main(String[] args) throws InterruptedException, RequestFailedException, IOException {
        System.setProperty("webdriver.chrome.driver","D:\\WorkHelp\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.datadoghq.com/dashboard/bae-etv-3sk/babaks-db-views?from_ts=1668191241425&to_ts=1668191541425&live=true");
/*
        WebElement username = driver.findElement(By.xpath("//input[@aria-label='Username/Email']"));
        WebElement Password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
        username.sendKeys("dgerashchenko");

        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/div[6]/form/button"));
        button.click();
        */
        Thread.sleep(60000);
        /* driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));*/
      // WebElement value = driver.findElement(By.xpath("(//div[@class='query-value__value'])[1]"));
        ///html/body/div[2]/div[3]/div[2]/div[1]/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div/div[1]
       int a = 1;
       String staticparam = String.valueOf(2.5);
       do {
           WebElement value = driver.findElement(By.xpath("(//div[@class='query-value__value'])[1]"));
           String par = value.getText();
           double MyParam = Double.parseDouble(par);
           System.out.println(MyParam);
           double staticparamtheir = Double.parseDouble(staticparam);
           System.out.println(staticparamtheir);
           if (MyParam>=staticparamtheir){
             // apiClient.main();
              trySkype.main();
               System.out.println("Alarm it bigger");
           } else {
               System.out.println("It`s OK");
           }
           a++;
           Thread.sleep(120000);
       } while (a<300);
    }
}
