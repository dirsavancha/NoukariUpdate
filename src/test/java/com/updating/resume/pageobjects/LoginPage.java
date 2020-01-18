package com.updating.resume.pageobjects;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.updating.resume.util.CommonUtil;

public class LoginPage {
	private WebDriver driver;

	@FindBy(id = "login_Layer")
	private WebElement loginlink;
	
	@FindBy(id = "eLoginNew")
	private WebElement uname;
	
	@FindBy(id = "pLogin")
	private WebElement pswd;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	private WebElement submit;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void windowsHandle() {
		String parent_window = driver.getWindowHandle();

		Set<String> child_win = driver.getWindowHandles();
		ArrayList<String> arr = new ArrayList<String>(child_win);
		for (String ch : arr) {
			driver.switchTo().window(ch);
			System.out.println(driver.getTitle());
		}
		String first_child = arr.get(1);
		driver.switchTo().window(first_child).close();
		String second_child = arr.get(2);
		driver.switchTo().window(second_child).close();
		String third_child = arr.get(3);
		driver.switchTo().window(third_child).close();

		driver.switchTo().window(parent_window);
	}
	
	public void clickNoukariLogin() {
		loginlink.click();
		
	}
	public void enterUserName(String username) {
		this.uname.sendKeys(username);
	}
	public void enterPassword(String password) {
		this.pswd.sendKeys(password);
		
	}
	public HomePage clickSubmitButton() {
		submit.click();
		
		return PageFactory.initElements(driver, HomePage.class);
	}

}
