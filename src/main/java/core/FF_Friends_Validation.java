package core;

import java.util.logging.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FF_Friends_Validation {
       public static void main(String[] args) throws InterruptedException, IOException {
/*              Logger logger = Logger.getLogger("");
              logger.setLevel(Level.OFF);
              System.setProperty("webdriver.gecko.driver", "./src/main/resources/webdrivers/pc/geckodriver.exe");*/
              
			  String in_browser = "Edge"; // Firefox or Chrome or Safari or IE or Edge
              CrossBrowser.setWebDriver(in_browser);
              String url = "http://www.facebook.com";
              WebDriver driver = CrossBrowser.driver;

              String n_friends_expected = "81";

              WebDriverWait wait = new WebDriverWait(driver, 10);
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              driver.get(url);
//            String title_actual= driver.getTitle();
//            String copyright_actual = driver.findElement(By.xpath("//div[3]/div/span")).getText();
              driver.findElement(By.id("email")).sendKeys("kamenkaksk@gmail.com");

              driver.findElement(By.id("pass")).sendKeys("***");
              driver.findElement(By.id("u_0_q")).click();    
              Thread.sleep(1000);   // --- 1 sec
              wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/a/span"))).click();
              String n_friends_actual = driver.findElement(By.xpath("//div[2]/div/div/a[3]/span[1]")).getText();
              driver.findElement(By.id("userNavigationLabel")).click();
              driver.findElement(By.xpath("//li[19]/a/span/span")).click();
              driver.quit();
       
              if (n_friends_expected.equals(n_friends_actual)) {
                     System.out.println("Test Case ID:\t\tTC-01.01.01");
                     System.out.println("Test Case Resul:\t" + "PASSED");
              } else {
                     System.out.println("Test Case ID:\t\tTC-01.01.01");
                     System.out.println("Test Case Resul:\t" + "FAILED");
              }
       }
}

