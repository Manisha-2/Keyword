

	import org.apache.log4j.Logger;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Keyword.Constant;
import Keyword.Keyword;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class Log4j {

	private static WebDriver driver = null;

	public static void main(String[] args) {

	// Create a new instance of the Firefox driver
		WebDriverManager.chromedriver().setup();
		Constant.driver = new ChromeDriver(); 
	// Hit the URL for which you want to see logs
		//Constant.driver.get(“https://www.amazon.in/”);
		Keyword.openURL("https://www.amazon.in/");

	// Create reference variable “log” referencing getLogger method of Logger class, it is used to store logs in selenium.txt
	//Logger log = Logger.getLogger(“devpinoyLogger”);
	Logger log=Logger.getLogger("devpinoyLogger");

	// Call debug method with the help of referencing variable log and log the information in test.logs file
	//log.debug(“Getting errors”);
	log.debug("Get Error Message");

	}

	}


