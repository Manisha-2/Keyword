import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Keyword.Constant;
import Keyword.Keyword;
import io.github.bonigarcia.wdm.WebDriverManager;
 
 
public class Google {
    public static void main(String[] args) {
      
    // Here we need to create logger instance so we need to pass Class name for 
     //which  we want to create log file in my case Google is classname
         Logger logger=Logger.getLogger("Google");
        
 
       // configure log4j properties file
       PropertyConfigurator.configure("Log4j.properties");
 
 
        // Open browser
       WebDriverManager.chromedriver().setup();
		Constant.driver = new ChromeDriver(); 
		//Keyword.openURL("https://www.amazon.in/");
        logger.info("Browser Opened");
      
        // Set implicit wait
        Constant.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Implicit wait given");
      
 
        // Load application
        Constant.driver.get("https://www.amazon.in/");
        logger.info("Url opened");
      
 
//        // type Selenium
//        Constant.driver.findElement(By.name("q")).sendKeys("Selenium");
//        logger.info("keyword type");           
    }
}