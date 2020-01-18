package com.updating.resume.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class CommonUtil {
	 static WebDriver driver=null;
	
	public static String getProperties(String fn,String key)throws IOException {
		try {
			FileInputStream fis=new FileInputStream("testdata/"+fn+".properties");
			
			Properties pr=new Properties();
			pr.load(fis);
			return pr.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static String getCurrentDate() {
		String date=LocalDateTime.now().toString();
		
		return date.replace(":", "_").substring(0, date.indexOf('.'));
	}
	public static void takeScreenShot(WebDriver driver) {
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		File dest=new File("screenshot/"+getCurrentDate()+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void closeBrowser() {
		driver.close();
	}

}
