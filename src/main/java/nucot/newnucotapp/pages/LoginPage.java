package nucot.newnucotapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
public WebDriver odriver;
	
	//1.By locators
	
	private	By userName=By.xpath("//input[@name='username']");
	private	By passWord=By.xpath("//input[@name='password']");
	private By loginButton=By.xpath("//button[@type='submit']");
	private By companyName=By.xpath("//img[@alt='company-branding']");
	
	//2.page constant
	
	public LoginPage(WebDriver odriver){
		this.odriver=odriver;	
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
	public AdminPage loginApp(String un,String pwd) throws InterruptedException{
		Thread.sleep(3000);
		odriver.findElement(userName).sendKeys(un);
		Thread.sleep(3000);
		odriver.findElement(passWord).sendKeys(pwd);
		odriver.findElement(loginButton).click();
		Thread.sleep(3000);
		return new AdminPage(odriver);
	}

	
	
	
}
