package nucot.newnucotapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
	
	
	public WebDriver odriver;
	
	public AdminPage(WebDriver odriver) {
		this.odriver=odriver;	
	}
	//1.By locators
	private By admin=By.xpath("//span[text()='Admin']");
	

	//2.action
	public String getAdminPagetitle()
	{
		String title=odriver.getTitle();
		System.out.println("Admin psge title "+ title);
		return title;
		
	}
	
	public String getAdminPageUrl()
	{
		String url=odriver.getCurrentUrl();
		System.out.println("Admin psge title "+ url);
		return url;
		
	}
	
	
	
	
	

}
