package nucot.newnucotapp.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import nucot.newnucotapp.util.ElementUtil;


public class LoginPage {

	
public WebDriver odriver;
public ElementUtil eleUtil;
	
	//1.By locators
	
	private	By userName=By.xpath("//input[@name='username']");
	private	By passWord=By.xpath("//input[@name='password']");
	private By loginButton=By.xpath("//button[@type='submit']");
	private By companyName=By.xpath("//img[@alt='company-branding']");
	
	//2.page constant
	
	public LoginPage(WebDriver odriver){
		this.odriver=odriver;
		eleUtil = new ElementUtil(odriver);
	}
	
	//3.PageActions/implemented methods	
	public String getLoginPageTitle(){
		String title=odriver.getTitle();
		System.out.println("Login page tiltle is -->" + title );
		return title;	
	}
		
	public String getCurrentUrlPage()
	{
		String currentUrl=odriver.getCurrentUrl();
		System.out.println("Current Url of the page--->"+ currentUrl);
		return currentUrl;
	}
	
	//TDD
	public AdminPage loginApp(String un,String pwd) {
		System.out.println("App creds are : " + un + ":" + pwd);
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		eleUtil.doSendKeys(userName, un);
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		eleUtil.doSendKeys(passWord, pwd);
		eleUtil.doClick(loginButton);
		odriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return new AdminPage(odriver);
	}

	
	
	
}
