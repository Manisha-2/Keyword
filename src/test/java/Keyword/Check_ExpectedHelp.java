package Keyword;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.google.gson.reflect.TypeToken;



public class Check_ExpectedHelp {
	@Test
	public static void ChechHElp() throws IOException, ParseException, InterruptedException {//Iterator<String> 
		Keyword.openBrowser("Chrome");
		Keyword.openURL("https://www.amazon.in/");
		Constant.driver.manage().window().maximize();
		Keyword.implicit_Wait(1, "SECONDS");
		Keyword.clickOnElement("XPATH", "//a[contains(text(),'Customer Service')]");
		JSONParser parser = new JSONParser();
		Object unitsObj = parser.parse(new FileReader("D:\\WorkSapce\\Keyword\\src\\test\\resources\\ExpectedHelpTopics.Json"));
		JSONObject unitsJson = (JSONObject) unitsObj;

		JSONArray units = (JSONArray) unitsJson.get("Recommended Topics");
		//System.out.println(units);
		JavascriptExecutor js = ((JavascriptExecutor) Constant.driver);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		List<WebElement> liList = Constant.driver.findElements(By.cssSelector(" #help-gateway-category-0:nth-child(2)>div>div>div>ul>li>a"));
		ArrayList<String> actualResult = new ArrayList<String>();
		List<String> expectedResult = new ArrayList();
		Iterator<WebElement> itr=liList.iterator();
		while(itr.hasNext())
		{
			actualResult.add(itr.next().getText());
			System.out.println(actualResult.size());
		}
//		
		
//		
//		 for (int j=0; j<liList.size(); j++){
//			   System.out.println(actualResult.add(liList.get(j).getText()));
//			// System.out.println(j);
//			}
		System.out.println(actualResult);
		System.out.println(actualResult.size());
		 System.out.println("================================================'");
String s[]=new String[units.size()];
	int i=0;
	for(i=0;i<units.size();i++) {
			 s[i]=(String) units.get(i);
			 
			System.out.println(s.length);
		}
		//System.out.println(s.length);
		
for(int k=0;k<units.size();k++)
{
	expectedResult.add(k, s[k]);
	System.out.println(expectedResult.size());
	}
		
System.out.println(expectedResult);
System.out.println(expectedResult.size());
	Assert.assertEquals(actualResult,expectedResult);

	}
	
}
