package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Browser.Browser;

public class AboutUs extends Browser{
	
	public static void OpenURL(String a) {
		try {
		Browser.OpenBrowser();
		Browser.OpenURL(a);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void loginOne() {
		try {
		Login.login1();
		Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void mobile(String mobilenumber) {
		try {
		Login.mobilenumber(mobilenumber);
		Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void loginTwo() {
		try {
		Login.login2();
		Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void OTP() {
		try {
		Login.verifyOTP();
		Thread.sleep(30000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void aboutus() {
		
	try {
		int y = driver.findElement(By.linkText("About us")).getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,"+y+")");
		Thread.sleep(1000);
		driver.findElement(By.linkText("About us")).click();
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
		
	


