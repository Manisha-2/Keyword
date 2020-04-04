import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Keyword.Constant;
import Keyword.Keyword;

public class Test_Cses_EMI {
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
	public void tc_4() throws InterruptedException{
		Set<String> set= Constant.driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(set);
		Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
//	Thread.sleep(20000);
//	Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Keyword.implicit_Wait(5, "SECONDS");
		String Actual=Keyword.getWebElement("XPATH", "//span[contains(text(),'EMI')]").getText();
		Keyword.clickOnElement("XPATH", "//span[contains(text(),'EMI')]");

		String Expected="EMI";
	Assert.assertEquals(Actual,Expected);
		Keyword.logger_add("Click on EMI");
	}
	@Test
	public void tc_5() throws InterruptedException{
		Set<String> set= Constant.driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(set);
		Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
	//Thread.sleep(20000);
	//Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Keyword.implicit_Wait(5, "SECONDS");
		String Actual=Keyword.getWebElement("XPATH", "//h2[contains(text(),'Discover products with No Cost EMI')]").getText();
		String Expected="Discover products with No Cost EMI";
		Assert.assertEquals(Actual,Expected);
		Keyword.logger_add("Get Text");
		
	}
	@Test
	public void tc_6() throws InterruptedException{
		Set<String> set= Constant.driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(set);
		Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
//	Thread.sleep(20000);
//	Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Keyword.implicit_Wait(5, "SECONDS");
	String Actual=Keyword.getWebElement("XPATH", "//img[@alt=\"Mobile\"]").getText();
	String Expected="Mobile";
	//Assert.assertEquals(Actual,Expected);
	Keyword.clickOnElement("XPATH", "//img[@alt=\"Mobile\"]");
	Keyword.logger_add("Click on Mobile");
		
	}
	@Test
	public void tc_7() throws InterruptedException{
		Set<String> set= Constant.driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(set);
		Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
	//Thread.sleep(20000);
	//Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Keyword.implicit_Wait(5, "SECONDS");
	Actions a=new Actions( Constant.driver);
	a.moveToElement(Keyword.findWebElement("XPATH", "//span[contains(text(),'Mobiles & Accessories')]"));
	//Keyword.clickOnElement("XPATH", "//img[@alt=\"Mobile\"]");
	a.perform();
	Thread.sleep(20000);
	Keyword.logger_add("Mouse Over");
	Thread.sleep(20000);
	}

@Test
public void tc_8() throws InterruptedException, FileNotFoundException, IOException, ParseException{
	
	Thread.sleep(20000);
	List<String> expected=Keyword.readJsonFile("D:\\WorkSapce\\Keyword\\src\\test\\resources\\Mobileaccessoriesdata.json");
	
	List<String> actual=Keyword.listValueSelect("CSS", "#nav-flyout-aj\\:https\\:\\/\\/images-eu\\.ssl-images-amazon\\.com\\/images\\/G\\/31\\/img18\\/Electronics\\/Megamenu\\/megamenumar18f\\.json\\:subnav-sl-megamenu-1\\:0 > div.nav-template.nav-flyout-content > div > div:nth-child(1) > ul>li");
Assert.assertEquals(actual, expected);
}
public void tc_9() {
	Set<String> set= Constant.driver.getWindowHandles();
	ArrayList<String> arr=new ArrayList<String>(set);
	Constant.driver.switchTo().window(arr.get(0));
	System.out.println(set);
//Thread.sleep(20000);
//Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
Keyword.implicit_Wait(5, "SECONDS");
String Actual=Keyword.getWebElement("XPATH", "//span[contains(text(),'Mobiles & Accessories')]").getText();
String Expected="Mobiles & Accessories";
//Assert.assertEquals(Actual,Expected);
Keyword.clickOnElement("XPATH", "//span[contains(text(),'Mobiles & Accessories')]");
Keyword.logger_add("Click on Mobiles & Accessories");

}
 
	
}
