package basepackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class forgotPassword extends baseSetupOrangeHRM{

	@BeforeMethod(alwaysRun=true)
	public static void forgotPasswordTest() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]")).click();
		}
	@Test(priority=1)
	public static void resetPassword(){
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actual_text=driver.getCurrentUrl();
		Assert.assertEquals(actual_text, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/sendPasswordReset");
		
	}
	

}
