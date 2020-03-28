import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
	Thread.sleep(20000);
	Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Keyword.clickOnElement("XPATH", "//span[contains(text(),'EMI')]");
		
	}
	@Test
	public void tc_5() throws InterruptedException{
		Set<String> set= Constant.driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(set);
		Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
	Thread.sleep(20000);
	Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		String Actual=Keyword.getWebElement("XPATH", "//h2[contains(text(),'Discover products with No Cost EMI')]").getText();
		String Expected="Discover products with No Cost EMI";
		Assert.assertEquals(Actual,Expected);
		
		
	}
	@Test
	public void tc_6() throws InterruptedException{
		Set<String> set= Constant.driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(set);
		Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
	Thread.sleep(20000);
	Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Keyword.clickOnElement("XPATH", "//img[@alt=\"Mobile\"]");
	
		
	}
	@Test
	public void tc_7() throws InterruptedException{
		Set<String> set= Constant.driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(set);
		Constant.driver.switchTo().window(arr.get(0));
		System.out.println(set);
	Thread.sleep(20000);
	//Constant.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Actions a=new Actions( Constant.driver);
	a.moveToElement(Keyword.FindWebElement("XPATH", "//span[contains(text(),'Mobiles & Accessories')]"));
	//Keyword.clickOnElement("XPATH", "//img[@alt=\"Mobile\"]");
	a.perform();
	Thread.sleep(20000);
		
	}

   // 
	//span[contains(text(),'Mobiles & Accessories')]"
  
	
}
