package testclasses;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.BaseClass;

import java.time.Duration;
import java.util.List;

	public class IndeedJobScraperTest extends BaseClass{
	    public static void main(String[] args) {
	      
	    	System.out.println("sdsdfvsdvsfd");
			driver=new ChromeDriver();
			driver.get("https://www.indeed.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.findElement(By.id("text-input-what")).sendKeys("QA");	
			driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton")).click();
	        // Define a maximum number of pages to scrape (adjust as needed)
	        int maxPages = 3;

	        // Iterate through each page
	        for (int currentPage = 1; currentPage <= maxPages; currentPage++) {
	            // Find job cards on the current page
	            List<WebElement> jobCards = driver.findElements(By.id("mosaic-provider-jobcards"));

	            // Print job titles from each job card on the current page
	            for (WebElement jobCard : jobCards) {
	                WebElement jobTitleElement = jobCard.findElement(By.xpath("//*[@class=\"jcs-JobTitle css-jspxzf eu4oa1w0\"]"));
	                String jobTitle = jobTitleElement.getText();
	                System.out.println("Job Title: " + jobTitle);
	            }

	            // Navigate to the next page (if available)
	            WebElement nextPageButton = driver.findElement(By.xpath("//nav[@class='css-98e656 eu4oa1w0']//li[@class='css-227srf eu4oa1w0']/a[@class='css-akkh0a e8ju0x50']\r\n"
	            		+ ""));
	            if (nextPageButton.isEnabled()) {
	                nextPageButton.click();
	            } else {
	                // Break if there is no next page
	                break;
	            }
	        }

	        // Close the browser
	        driver.quit();
	    }
	}


