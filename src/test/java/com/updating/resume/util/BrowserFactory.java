package com.updating.resume.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	public static WebDriver driver=null;
	
	public static WebDriver getBrowser(String bn,String rm) {
		if(rm.equals("local")) {
		if(bn.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else if(bn.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
			
		}else if(bn.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
	}
		else if(rm.equals("remote")) {
			ChromeOptions ch=new ChromeOptions();
			try {
				driver=new RemoteWebDriver(new URL(""),ch);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		return driver;
	}
	
	public static void openUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public static void closeBrowser() {
		driver.close();
	}

}
