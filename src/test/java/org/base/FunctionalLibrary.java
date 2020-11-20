package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionalLibrary {
	
	public static WebDriver driver;
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Dell\\sudha\\eclipse-workspace\\PracticCucumber\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;

	}
	
	public void switchtoFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchtoFrameByElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void switchtoFrameByName(String id) {
		driver.switchTo().frame(id);
	}
	
	public void LoadUrl(String url) {
		driver.get(url);
	}
	
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	public void type(WebElement element,String data) {
		element.sendKeys(data);
	}
	
	public void getTxt(WebElement element) {
		element.getText();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public  Dimension frameCount() {
		WebElement firstFrame = driver.findElement(By.name("iframe"));
		return firstFrame.getSize();
	}
	
	public void quit() {
		driver.quit();
	}
	
	public void close() {
		driver.close();
	}
	
	public void typejs(WebElement element,String data) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
	}
	
	public void clickjs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("aargumnets[0].click()", element);
	}
	
	public void selectByText(WebElement element,String data) {
		Select s=new Select(element);
		s.selectByValue(data);
	}
	
	public void selectByindex(WebElement element,int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
		}
	
	
	
	
}











































