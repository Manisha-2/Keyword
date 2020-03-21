import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Keyword.Keyword;

public class Amezon_Test {
	public	static WebDriver  driver;
	@Test
	public void tc_01() {
		Keyword.openBrowser("Chrome");
	}
	@Test
	public void tc_02() {
		Keyword.openURL("https://www.amazon.in/");
	}
	@Test
	public void tc_03() {
		Keyword.clickOnElement("XPATH", "//a[contains(text(),'Amazon Pay')]");
	}
//		Keyword.enterText("XPATH", "//input[@name='pass']", "acg@123");
//		
//		Keyword.selectValue("XPATH", "//select[@name='birthday_day']", "23");
//		Keyword.selectValue("XPATH", "//select[@name='birthday_month']", "Sept");
//		Keyword.selectValue("XPATH", "//select[@name='birthday_year']", "1994");
		
}
	


