package com.updating.resume.noukari;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Dummy {
	/*
	 * private WebDriver driver;
	 * 
	 * public void loginPage() throws Exception {
	 * 
	 * WebDriverManager.chromedriver().setup();
	 * 
	 * driver = new ChromeDriver();
	 * 
	 * driver.get("https://www.naukri.com"); driver.manage().window().maximize();
	 * 
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * 
	 * String parent_window = driver.getWindowHandle();
	 * 
	 * Set<String> child_win = driver.getWindowHandles(); ArrayList<String> arr =
	 * new ArrayList<String>(child_win); for (String ch : arr) {
	 * driver.switchTo().window(ch); System.out.println(driver.getTitle()); } String
	 * first_child = arr.get(1); driver.switchTo().window(first_child).close();
	 * String second_child = arr.get(2);
	 * driver.switchTo().window(second_child).close(); String third_child =
	 * arr.get(3); driver.switchTo().window(third_child).close();
	 * 
	 * driver.switchTo().window(parent_window); }
	 * 
	 * public void clickLoginLink() throws Exception {
	 * driver.findElement(By.id("login_Layer")).click(); Thread.sleep(5000);
	 * Set<String> all_win = driver.getWindowHandles(); ArrayList<String> al = new
	 * ArrayList<String>(all_win); for (String win : al) {
	 * driver.switchTo().window(win); System.out.println(driver.getTitle());
	 * 
	 * driver.findElement(By.id("eLoginNew")).sendKeys("ramakrishna_85@outlook.com")
	 * ; driver.findElement(By.id("pLogin")).sendKeys("Selenium@007");
	 * driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	 * Thread.sleep(5000); } }
	 * 
	 * public void HomePage() throws Exception {
	 * 
	 * driver.findElement(By.xpath("//div[contains(text(),'UPDATE PROFILE')]")).
	 * click(); Thread.sleep(5000);
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor) driver;
	 * js.executeScript("scroll(0,250)");
	 * 
	 * driver.findElement(By.
	 * xpath("//span[contains(text(),'Resume Headline')]/following-sibling::span")).
	 * click(); Thread.sleep(5000); driver.findElement( By.
	 * xpath("//div[@class='action s12']/button[contains(@type,'submit')][contains(text(),'Save')]"
	 * )) .click();
	 * 
	 * Thread.sleep(5000);
	 * 
	 * }
	 * 
	 * public void logout() throws Exception { JavascriptExecutor js =
	 * (JavascriptExecutor) driver; js.executeScript("scroll(0,-250)"); WebElement
	 * ele = driver .findElement(By.
	 * xpath("//a [@href='https://my.naukri.com/HomePage/view'][@ target=\"_blank\"]"
	 * )); Actions act = new Actions(driver); Action mouse_move =
	 * act.moveToElement(ele).build(); mouse_move.perform();
	 * 
	 * Thread.sleep(5000); driver.findElement(By.
	 * xpath("//a [@href='https://www.naukri.com/nlogin/logout'] [@title='Logout']")
	 * ).click();
	 * 
	 * }
	 */
	/*
	 * Demo dm = new Demo();
	 * 
	 * @Test public void main() { try {
	 * 
	 * dm.loginPage(); dm.clickLoginLink(); dm.HomePage(); dm.logout();
	 * }catch(Exception e) { e.printStackTrace(); } }
	 */
	@Test
	 public void test() {
		 System.out.println("testmethod");
	}

}
