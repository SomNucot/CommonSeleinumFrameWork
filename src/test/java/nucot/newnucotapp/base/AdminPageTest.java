package nucot.newnucotapp.base;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdminPageTest extends BaseTest{
	
	@BeforeClass
	void adminPageSetUP() throws InterruptedException
	{
		oadminPage=ologinPage.loginApp("Admin", "admin123");
			
	}
	
	
	@Test
	void adminPagetitleTest()
	{
		
		String actualTitle=oadminPage.getAdminPagetitle();
		Assert.assertEquals(actualTitle,"");
		
		
	}
	
	
	@Test
	void adminPageUrlTest()
	{
		String actualUrl= oadminPage.getAdminPageUrl();
		Assert.assertEquals(actualUrl, "");
	}
	
	
	
	
	

}
