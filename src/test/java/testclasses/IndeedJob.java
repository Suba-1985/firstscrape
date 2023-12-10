package testclasses;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseClass.BaseClass;

public class IndeedJob extends BaseClass{
	
	    private String jobTitle;
	    private String jobCompName;
	    private String jobLocation;

	  
	    public IndeedJob(String string, String string2, String string3) {
			// TODO Auto-generated constructor stub
		}

		public String getJobTitle() {
	        return jobTitle;
	    }

	    public void setJobTitle(String jobTitle) {
	        this.jobTitle = jobTitle;
	    }

	   
	    public String getJobCompName() {
	        return jobCompName;
	    }

	    public void setJobCompName(String jobCompName) {
	        this.jobCompName = jobCompName;
	    }

	  
	    public String getJobLocation() {
	        return jobLocation;
	    }

	    public void setJobLocation(String jobLocation) {
	        this.jobLocation = jobLocation;
	    }
	}


