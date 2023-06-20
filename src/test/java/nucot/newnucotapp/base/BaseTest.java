package nucot.newnucotapp.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import nucot.newnucotapp.pages.AdminPage;
import nucot.newnucotapp.pages.LoginPage;
import nucot.newnucotapp.setup.InitSetUp;

public class BaseTest {

	InitSetUp is;
	WebDriver odriver;
	protected Properties prop;
	protected LoginPage ologinPage;
	protected AdminPage oadminPage;
	protected SoftAssert softAssert;
	
	
	@BeforeTest
	void setUpApp()
	{	
		is=new InitSetUp();
		prop = is.initProp();
		odriver=is.setUpDriver(prop);
		ologinPage=new LoginPage(odriver);
		softAssert = new SoftAssert();
	}
	

	@AfterTest
	void closeApp(){	
		odriver.quit();	
	}

}
