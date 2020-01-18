package com.updating.resume.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.updating.resume.util.CommonUtil;


public class HomePage {
	private WebDriver driver;
	
	@FindBy(xpath="//div[contains(text(),'UPDATE PROFILE')]")
	private WebElement updateProfile;
	
	@FindBy(xpath="//span[contains(text(),'Resume Headline')]/following-sibling::span[text()='Edit']")
	private WebElement clickonResumeHeadline;
	
	@FindBy(xpath="//div[@class='action s12']/button[contains(@type,'submit')][contains(text(),'Save')]")
	private WebElement resumeHeadLine_SaveButton;
	
	@FindBy(xpath="//a [@href='https://my.naukri.com/HomePage/view'][@ target='_blank']")
	private WebElement myNoukariLink;
	
	@FindBy(xpath="//a [@href='https://www.naukri.com/nlogin/logout'] [@title='Logout']")
	private WebElement clickOnLogOutButton;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnUpdateProfileLink() {
		this.updateProfile.click();
		
	}
	public void clickOnResumeHeadLineLink() {
		CommonUtil.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,250)");
		this.clickonResumeHeadline.click();
	}
	public void clickOnSaveButton() {
		CommonUtil.sleep(2000);
		this.resumeHeadLine_SaveButton.click();
	}
	
	public LoginPage logout() {
		CommonUtil.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,-250)");
		CommonUtil.sleep(2000);
		Actions act=new Actions(driver) ;
		Action act_move= act.moveToElement(myNoukariLink).build();
		act.perform();
		CommonUtil.sleep(2000);
		clickOnLogOutButton.click();
		return PageFactory.initElements(driver, LoginPage.class);
			
		
	}
}
