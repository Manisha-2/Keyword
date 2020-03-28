import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Keyword.Constant;
import Keyword.Keyword;

public class Amezon_Test {
	//public	static WebDriver  driver;
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
	@Test
	public void tc_04() throws InterruptedException{
		Set<String> set= Constant.driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(set);
		Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
		Thread.sleep(2000);
		Keyword.clickOnElement("XPATH", "//span[contains(text(),'Your Transactions')]");
	}
	@Test
	public void tc_05() throws InterruptedException{
		Set<String> set= Constant.driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(set);
		Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
		Thread.sleep(2000);
		Keyword.clickOnElement("XPATH", "//a[contains(text(),'Create your Amazon account')]");
	}
	@Test
	public void tc_06() throws InterruptedException{
		Set<String> set= Constant.driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(set);
		Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
		Thread.sleep(2000);
		Keyword.enterText("XPATH", "//input[@name=\"customerName\"]", "Manisha");
	}
	@Test
	public void tc_07() throws InterruptedException{
		Set<String> set= Constant.driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(set);
		Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
		Thread.sleep(2000);
		Keyword.enterText("XPATH", "//input[@id='ap_phone_number']", "8625974462");
	}
//	
	@Test
	public void tc_09() throws InterruptedException{
		Set<String> set= Constant.driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(set);
		Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
		Thread.sleep(2000);
		Keyword.enterText("XPATH", "//input[@type='password']", "manishankale23@gmail.com");
	}
	@Test
	public void tc_10() throws InterruptedException{
		Set<String> set= Constant.driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(set);
		Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
		Thread.sleep(2000);
		Keyword.clickOnElement("XPATH", "//input[@id='continue']");
//		Thread.sleep(2000);
//		Keyword.openURL("https://www.amazon.in/");
	}
	@Test
	public void tc_11() throws InterruptedException{
	Set<String> childWindow= Constant.driver.getWindowHandles();
		System.out.println(childWindow);
		ArrayList<String> requiredWindow=new ArrayList<String>(childWindow);
//		Constant.driver.switchTo().window(requiredWindow.get(0));
//	
//		Constant.driver.navigate().back();
//		Constant.driver.navigate().back();
//		Constant.driver.navigate().back();
//		Constant.driver.navigate().back();
//	Keyword.clickOnElement("XPATH", "");
//	//Keyword.clickOnElement("XPATH", "//span[contains(text(),' Account Settings')]");
	Thread.sleep(20000);
	String Actual=Keyword.getWebElement("XPATH", "//div[@class='a-section auth-pagelet-container']/descendant::h4[1]]").getText();
	String Expected="Mobile number already in use";
	System.out.println(Actual);
	Assert.assertEquals(Actual,Expected);
	}
	
	
	
//		Keyword.enterText("XPATH", "//input[@name='pass']", "acg@123");
//		
//		Keyword.selectValue("XPATH", "//select[@name='birthday_day']", "23");
//		Keyword.selectValue("XPATH", "//select[@name='birthday_month']", "Sept");
//		Keyword.selectValue("XPATH", "//select[@name='birthday_year']", "1994");
		
}


	


