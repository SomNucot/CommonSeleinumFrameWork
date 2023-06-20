package nucot.newnucotapp.base;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import nucot.newnucotapp.constantspage.ConstantsPage;

public class AdminPageTest extends BaseTest{
	
	
	
	@BeforeClass
	void adminPageSetUP(){
		oadminPage=ologinPage.loginApp(prop.getProperty("username").trim(),prop.getProperty("password").trim());		
	}
	
	@Test
	void adminPagetitleTest(){
		String actualTitle=oadminPage.getAdminPagetitle();
		Assert.assertEquals(actualTitle,ConstantsPage.ADMIN_PAGE_TITLE_VALUE);	
	}
	
	
	@Test
	void adminPageUrlTest(){
		String actualUrl= oadminPage.getAdminPageUrl();
		Assert.assertEquals(actualUrl,ConstantsPage.ADMIN_PAGE_URL_VALUE);
	}
	
	
	
	
	

}
