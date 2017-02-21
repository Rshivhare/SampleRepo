package OneP_Process;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login1 {

		public static void main(String[] args) throws Exception 
		{
			
			   String serverIP="proxy4.wipro.com";
			   int port=8080;   

			   File pathToBinary = new File("D:\\softwares\\FF44\\Mozilla Firefox\\firefox.exe");
			   FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
			   //FirefoxProfile firefoxProfile = new FirefoxProfile();       
			   //WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
			   
			    FirefoxProfile profile = new FirefoxProfile();
			    profile.setPreference("network.proxy.type",1);
			    profile.setPreference("network.proxy.ftp",serverIP);
			    profile.setPreference("network.proxy.http",serverIP);
			    profile.setPreference("network.proxy.socks",serverIP);
			    profile.setPreference("network.proxy.ssl",serverIP);
			    profile.setPreference("network.proxy.ftp_port",port);
			    profile.setPreference("network.proxy.http_port",port);
			    profile.setPreference("network.proxy.socks_port",port);
			    profile.setPreference("network.proxy.ssl_port",port);
			    WebDriver driver = new FirefoxDriver(ffBinary, profile);
			    WebDriverWait wait=new WebDriverWait(driver,200);
			    /*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
			    
			/*
			System. setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
			
			ChromeOptions o = new ChromeOptions();
			o.addArguments("disable-extensions");
			o.addArguments("--start-maximized");
			WebDriver driver = new ChromeDriver();
			WebDriverWait wait=new WebDriverWait(driver,200);
			
			
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		    
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("User name");
		    driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("password");
		    driver.findElement(By.xpath(".//*[@id='Login']")).click();
		    
		 
		    //driver.findElement(By.xpath(".//*[@id='tsidButton']")).click();
		    //driver.findElement(By.xpath(".//*[@id='tsid-menuItems']/a[2]")).click();
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='phSearchInput']"))).sendKeys("Campaign2");
	 
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='phSearchButton']"))).click();
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='Campaign_body']/table/tbody/tr[2]/td[1]/a"))).click();
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='cpn1']"))).clear();
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='cpn1']"))).sendKeys("Campaign2");
		   
		    driver.findElement(By.xpath(".//*[@id='cpn5']")).click();
		    driver.findElement(By.xpath(".//*[@id='calRow3']/td[5]")).click();
		   
		    driver.findElement(By.xpath(".//*[@id='cpn6']")).click();
		    driver.findElement(By.xpath(".//*[@id='calRow5']/td[7]")).click();
		   
		    driver.findElement(By.xpath(".//*[@id='bottomButtonRow']/input[2]")).click();
		    
		    driver.findElement(By.xpath(".//*[@id='userNavButton']")).click();
		    driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[5]")).click();
		    
		}
	}


