package swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTestClass extends Parameters{
	


    @BeforeMethod
    public void mySetup() {
		driver.get(Url);
	}
	
    
	@Test()
	public void LoginWithStandardUSer() throws InterruptedException {
	
		LogInFunction(StandardUserName, passWord);	
		Thread.sleep(3000);
	}
	


	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
		
		LogInFunction(ProblemUserName, passWord);	
			Thread.sleep(3000);
	}
	
	
	
	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
		LogInFunction(PerformanceUserName, passWord);	
		Thread.sleep(3000);
	}

	
	@AfterTest
	public void myPostTesting() {
		
	}
	
	
	
	
}
