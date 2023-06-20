package nucot.newnucotapp.base;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

	@Test
	public void loginPageTitleTest(){
		String actualTitleOfPage=ologinPage.getLoginPageTitle();
		Assert.assertEquals(actualTitleOfPage,prop.getProperty("expextedTitle").trim());
		
	}
	
	
	@Test
	public void getUrl()
	{
		String actualUrl= ologinPage.getCurrentUrlPage();
		Assert.assertEquals(actualUrl, prop.getProperty("expextedUrl").trim());
	
	}
	
	
	@Test
	public void loginTest()
	{
		
		oadminPage=ologinPage.loginApp(prop.getProperty("username").trim(),prop.getProperty("password").trim());
			
	}

}
