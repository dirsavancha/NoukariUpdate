package com.updating.resume.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.updating.resume.pageobjects.HomePage;
import com.updating.resume.pageobjects.LoginPage;
import com.updating.resume.util.BrowserFactory;
import com.updating.resume.util.CommonUtil;


public class NoukariRunner {
	
	WebDriver driver=null;
	
	@Test
	public void updateNoukari() throws Throwable {
		String errormsg="",result = "fail";
		try {
		String bname=CommonUtil.getProperties("config","browsername");
		System.out.println(bname);
		String rmode=CommonUtil.getProperties("config","runmode");
		System.out.println(rmode);
		String url=CommonUtil.getProperties("config", "url");
		System.out.println(url);
		WebDriver driver=BrowserFactory.getBrowser(bname, rmode);
		System.out.println(driver);
		BrowserFactory.openUrl(url);
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		lp.windowsHandle();
		lp.clickNoukariLogin();
		String uname=CommonUtil.getProperties("loginpage", "username");
		lp.enterUserName(uname);
		String pswd=CommonUtil.getProperties("loginpage", "password");
		lp.enterPassword(pswd);
		HomePage hp=lp.clickSubmitButton();
		hp.clickOnUpdateProfileLink();
		hp.clickOnResumeHeadLineLink();
		hp.clickOnSaveButton();
		hp.logout();
		CommonUtil.closeBrowser();
		
		}catch (Throwable t) {
			//CommonUtil.takeScreenShot(driver);
			t.printStackTrace();
			errormsg = t.getMessage();
			throw t;
		} finally {
			if (!errormsg.isEmpty())
				System.out.println(errormsg);

			System.out.println(result);

		}
	}

}
