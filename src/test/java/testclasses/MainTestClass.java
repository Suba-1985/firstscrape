//package testclasses;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//import java.util.Scanner;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import com.opencsv.CSVWriter;
//
//import baseClass.BaseClass;
//
//public class MainTestClass extends BaseClass{
//String job_Search;
//	
//	@Test(priority = 1)
//	public void test1()
//	{
//	Scanner myObj = new Scanner(System.in);
//	//System.out.println("What jobs are you looking for ? ");
////	job_Search = myObj.nextLine();
//	driver.findElement(By.id("text-input-what")).sendKeys("QA");	
//	driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton")).click();
//	}
//	
//	@Test(priority = 2)
//	public void paginationTest() throws InterruptedException, IOException
//	{   
//		CSVWriter csvWriter = new CSVWriter(new FileWriter("QA.csv")) ;
//        String[] headings= {"JobTitle","JobCompanyName"};
//        csvWriter.writeNext(headings);		
//		List<WebElement> total_pages= driver.findElements(By.xpath("//nav[@class='css-98e656 eu4oa1w0']//li[@class='css-227srf eu4oa1w0']/a"));
//		int pgSize=total_pages.size();		
//		System.out.println(pgSize);
//		
//		for(int i=1;i<pgSize;i++)
//		{
//		 Thread.sleep(2000);
//		 WebElement pagei=driver.findElement(By.xpath("//*[@id='jobsearch-JapanPage']/div/div[5]/div[1]/nav/ul/li['+ i +']"));	
//		 pagei.click();
//		
//		 
//		 WebElement jobCard=driver.findElement(By.xpath("//div[@id='mosaic-provider-jobcards']//ul//li"));
//		 List<WebElement> jobCardWitha = jobCard.findElements(By.tagName("a")); //goes to jobtitle of each jobcard
//		 int totcountofjobs=jobCardWitha.size();		
//		 System.out.println("total jobs in each page "+ i +"  "+totcountofjobs);
//		 
//		 for(int j=1;j<totcountofjobs;j++)
//		 {
//			// IndeedJob iJob=new IndeedJob(job_Search, job_Search, job_Search);			 
//			 //get JobTItle
//			 List<WebElement> jobTitle= driver.findElements(By.xpath("//*[@class=\"jcs-JobTitle css-jspxzf eu4oa1w0\"]"));
//			 System.out.println("job title  "+i+"  " +j+"  "+jobTitle.get(j).getText());			
//			
//			 String jTitle=jobTitle.get(j).getText();
//		***** // Find job cards on the current page
//        List<WebElement> jobCards = driver.findElements(By.xpath("//div[@class='jobsearch-SerpJobCard']"));
//
//        // Process each job card on the current page
//        for (WebElement jobCard : jobCards) {
//            // Extract job information
//            String jobTitle = jobCard.findElement(By.xpath(".//h2[@class='title']/a")).getText();
//            String company = jobCard.findElement(By.xpath(".//span[@class='company']")).getText();
//            String salary = jobCard.findElement(By.xpath(".//span[@class='salaryText']")).getText();
//            String jobType = jobCard.findElement(By.xpath(".//div[@class='jobMetadataHeader']/span")).getText();
//
//            // Store job information in the HashMap
//            jobDataMap.put(jobTitle, "Company: " + company + ", Salary: " + salary + ", Job Type: " + jobType);
//        }
//
//        // Navigate to the next page (if available)
//        WebElement nextPageButton = driver.findElement(By.xpath("//a[@aria-label='Next']"));
//        if (nextPageButton.isEnabled()) {
//            nextPageButton.click();
//        } else {
//            // Break if there is no next page
//            break;
//        }**************
//				
////			 List<WebElement> jobCompanyName= driver.findElements(By.xpath("//*[@class=\"jcs-JobTitle css-jspxzf eu4oa1w0\"]"));
////			 System.out.println("job title  "+i+"  " +j+"  "+jobTitle.get(j).getText());			
////			 
////			 String jCompanyName= jobTitle.get(j).getText();
////	
////			 
////			 List<WebElement> jobLocation= driver.findElements(By.xpath("//*[@class=\"jcs-JobTitle css-jspxzf eu4oa1w0\"]"));
////			 System.out.println("job title  "+i+"  " +j+"  "+jobTitle.get(j).getText());			
////			
////			 String[] jLocation= {jobTitle.get(j).getText()};
////		
////			 String[] jobCSV= {jTitle,jCompanyName,jCompanyName.toString()};
////			 csvWriter.writeNext(jobCSV);
//			 
//		 }
//		csvWriter.flush();
//		}
//	}
//	
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
