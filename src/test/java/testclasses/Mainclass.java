package testclasses;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseClass.BaseClass;

public class Mainclass extends BaseClass{

	HashMap<String,String[]> jobMap=new HashMap<>();
	
	@Test(priority = 1)
	public void test1()
	{
	Scanner myObj = new Scanner(System.in);	
	driver.findElement(By.id("text-input-what")).sendKeys("QA");	
	driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton")).click();
	}
	
	@Test(priority = 2)
	public void paginationTest() throws InterruptedException, IOException
	{  	
		List<WebElement> total_pages= driver.findElements(By.xpath("//nav[@class='css-98e656 eu4oa1w0']//li[@class='css-227srf eu4oa1w0']/a"));
		int pgSize=total_pages.size();		
		System.out.println(pgSize);
		
		for(int currentPage=1;currentPage<pgSize;currentPage++)
		{
			 JavascriptExecutor jse = (JavascriptExecutor)driver;
			 jse.executeScript("window.scrollBy(0,250)");
		 Thread.sleep(2000);
		 WebElement pagei=driver.findElement(By.xpath("//*[@id='jobsearch-JapanPage']/div/div[5]/div[1]/nav/ul/li['+ i +']"));	
				 pagei.click();
		 List<WebElement> jobCard=driver.findElements(By.xpath("//div[@id='mosaic-provider-jobcards']//ul//li"));
		 int s=jobCard.size();
		
		 for(WebElement jobs:jobCard)
		 {   for(int z=1;z<=s;z++) {
			 Thread.sleep(3000);
		
			 jse.executeScript("window.scrollBy(0,250)");

			 String jobTitle=driver.findElement(By.xpath("//h2[@class='jobTitle css-mr1oe7 eu4oa1w0']['+z+']")).getText();
			 jse.executeScript("window.scrollBy(0,250)");
			 jobMap.put(jobTitle, new String[] {jobTitle});
			// System.out.println("im running inside the loop"+jobMap.get(jobTitle).toString());
			 System.out.println(Arrays.asList(jobMap)); // method 1
			 //System.out.println(Collections.singletonList(jobMap)); // method 2
		 }
		 jse.executeScript("window.scrollBy(0,250)");
		 WebElement nextPageButton = driver.findElement(By.xpath("//a[@class='css-akkh0a e8ju0x50']"));
		if(nextPageButton.isDisplayed())
		 {
			 nextPageButton.click();
			 System.out.println("next is invoked");
		 }
		 else
		 {    System.out.println("break");
			 break;
		 }
		 }
		 // Print the job data stored in the HashMap
        for (String jobTitle : jobMap.keySet()) {
            System.out.println("Job Title: " + jobTitle);
            System.out.println("Job Information: " + jobMap.get(jobTitle));
            System.out.println("------");
        }

        // Close the browser
        driver.quit();
    }

	}
}			 

