package nucot.newnucotapp.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitSetUp {
	
	public WebDriver odriver;
	public WebDriver setUpDriver(String browserName)
	{
		
		System.out.println("Browser name is--->"+ browserName);
	
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			odriver=new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox"))
		{
			odriver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			odriver=new EdgeDriver();
		}
		else
		{
			System.out.println("Pass right browser name--->"+ browserName);
		}
		
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		odriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		return odriver;
				
	}
	
	
	

}
