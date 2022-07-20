package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import Browser.Browser;

public class AboutusNavigation extends Browser{
	
	public static void openUrl(String b) 
	{
		try {
		Browser.OpenBrowser();
		Browser.OpenURL(b);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void loginBttn()
	{
		try {
		Login.login1();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void mobileno(String mobilenumber) 
	{
		try {
		Login.mobilenumber(mobilenumber);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void lButton() 
	{
		try {
		Login.login2();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getOtp() 
	{
		try {
		Login.verifyOTP();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void aboutU() 
	{
		try {
			AboutUs.aboutus();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void log1()
	{
		try {
		Login.login1();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void mnumber(String number)
	{
		try {
		Login.mobilenumber(number);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void log2()
	{
		try {
		Login.login2();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void otpVerify()
	{
		try {
		Login.verifyOTP();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void navigateAbout() {
		try {
			AboutUs.aboutus();
			System.out.println("pass");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
