package basepackage;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class login extends baseSetupOrangeHRM{
	
	@Test
	public static void loginWithInvalidCredentials() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("fsdfd");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dfsdf");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actual_text= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/p[1]")).getText();
		Assert.assertEquals(actual_text, "Invalid credentials");
	}
	
	@Test(priority=1)
	public static void loginWithValidCredentials() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actual_text=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/span[1]/h6[1]")).getText();
		Assert.assertEquals(actual_text, "Dashboard");
				
	}

}
