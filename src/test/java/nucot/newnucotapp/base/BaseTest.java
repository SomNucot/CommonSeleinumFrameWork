package nucot.newnucotapp.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import nucot.newnucotapp.pages.AdminPage;
import nucot.newnucotapp.pages.LoginPage;
import nucot.newnucotapp.setup.InitSetUp;

public class BaseTest {

	InitSetUp is;
	WebDriver odriver;
	protected LoginPage ologinPage;
	protected AdminPage oadminPage;
	
	
	
	@BeforeTest
	void setUpApp()
	{	
		is=new InitSetUp();
		odriver=is.setUpDriver("chrome");
		ologinPage=new LoginPage(odriver);
	}
	

	@AfterTest
	void closeApp(){	
		odriver.quit();	
	}

}
