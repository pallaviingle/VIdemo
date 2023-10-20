package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    public HomePage(){
    	
    		PageFactory.initElements(driver, this);
    	}
     @FindBy(xpath="//input[@placeholder= \"Search\"]")
     WebElement SearchBox;
     
	 @FindBy(xpath="//span[text()='Admin']")
	 WebElement Admin;
	 
	 @FindBy(xpath="//span[text()='PIM']")
	 WebElement PIM;
	 
	 @FindBy(xpath="//span[text()='Leave']")
	 WebElement Leave;
	 
	 @FindBy(xpath="//span[text()='Time']")
	 WebElement Time;

	 @FindBy(xpath="//span[text()='Recruitment']")
	 WebElement Recruitment;
	
	 @FindBy(xpath="//span[text()='My Info']")
	 WebElement MyInfo;
	
	 @FindBy(xpath="//span[text()='Performance']")
	 WebElement Performance;
	
	 @FindBy(xpath="//span[text()='Dashboard']")
	 WebElement Dashboard;

	 @FindBy(xpath="//span[text()='Maintenance']")
	 WebElement Maintenance;	
	 
	 public void clickOnSearch() {
		 SearchBox.click();
	 }
	 public void clickOnAdmin() {
		 Admin.click();
	 }
	 public void clickOnPIM() {
		 PIM.click();
	 }
	 public void Leave() {
		 Leave.click();
	 }
	 public void clickOnTime() {
		 Time.click();
	 }
	 public void clickOnRecruitment() {
		 Recruitment.click();
	 }
	 public void clickOnMyInfo() {
		 MyInfo.click();
	 }
	 public void clickOnDashboard() {
		 Dashboard.click();
	 }

	 public void clickOnPerformance() {
		 Performance.click();
	 }

	 public void clickOnMaintenance() {
		 Maintenance.click();
	 }
}



