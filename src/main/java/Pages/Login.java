package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Browser.Browser;

public class Login extends Browser {
	
	public static void login1()
	{
		try {
			
			
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		public static void mobilenumber(String mobilenumber)
		{
			try {
				driver.findElement(By.xpath("//input[@aria-invalid='false']")).sendKeys("9392432671");
				Thread.sleep(1000);
			
			}
			catch(Exception e){
				e.printStackTrace();				
			}
		}
		public static void login2()
		{
			try {
				driver.findElement(By.xpath("(//button[@aria-label='Login'])[2]")).click();
				Thread.sleep(30000);		
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		public static void verifyOTP()
		{
			try {
				driver.findElement(By.xpath("//button[@aria-label='Verify OTP']")).click();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		public static void aboutusPage() {
			try {
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,5000)");
				Thread.sleep(1000);
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
}
	
	
	


