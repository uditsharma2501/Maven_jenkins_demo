package maven_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountPageUITest {
	
	static WebElement img_ProfilePicture=null, lbl_loggedIn_user=null, lbl_userRole=null;
	static WebElement btn_AddAccount=null;
	
	@Test(priority=0)
	public void Find_ProfilePicture() //if exception is caught and assertion is added in catch block, test case will fail with provided message
	{	
		try {
		
			img_ProfilePicture=Base.driver.findElement(By.xpath("//img[contains(@src, 'img/avatar1.jpg')]"));
		
		}catch(NoSuchElementException e)
		{
			Assert.fail("Profile picture not visible");
		}
	}
	
	
	@Test(priority=1)
	public void Find_LoggedIn_Username() //if exception is caught and assertion is added in catch block, test case will fail with provided message
	{	
		try {
		
			lbl_loggedIn_user=Base.driver.findElement(By.xpath("//div[@class='username']"));
		
		}catch(NoSuchElementException e)
		{
			Assert.fail("Username not visible");
		}
	}
	
	@Test(priority=2)
	public void Find_UserRole() //if exception is caught and assertion is added in catch block, test case will fail with provided message
	{	
		try {
		
			lbl_userRole=Base.driver.findElement(By.xpath("//div[@class='logged-user-role']"));
		
		}catch(NoSuchElementException e)
		{
			Assert.fail("User-role not visible");
		}
	}
	
	@Test(priority=3)
	public void Find_AddAccountButton() //if exception is caught and assertion is added in catch block, test case will fail with provided message
	{	
		try {
		
			btn_AddAccount=Base.driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm']//span[text()='Add Account']"));
		
		}catch(NoSuchElementException e)
		{
			Assert.fail("Add Account button not visible");
		}
	}


}
