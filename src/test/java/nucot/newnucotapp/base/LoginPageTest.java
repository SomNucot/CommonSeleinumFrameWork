package nucot.newnucotapp.base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

	@Test
	public void loginPageTitleTest(){
		String actualTitleOfPage=ologinPage.getLoginPageTitle();
		Assert.assertEquals(actualTitleOfPage,"OrangeHRM");
		
	}
	
	@Test
	public void getUrl()
	{
		String actualUrl= ologinPage.getCurrentUrlPage();
		Assert.assertEquals(actualUrl, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}
	
	
	@Test
	public void loginTest() throws InterruptedException
	{
		
		oadminPage=ologinPage.loginApp("Admin","admin123");
			
	}

}
