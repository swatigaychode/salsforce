package Resources;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {

	public WebDriver driver;
	 public Properties prop;
	
	public void driverInitilize() throws IOException {
	    //This will read the properties file
	  FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Data.properties");
	  
	  // accee the properties file--
	  
	    prop=new Properties();
	  prop.load(fis);
	  
	  String browserName=prop.getProperty("browser");
	  if (browserName.equalsIgnoreCase("chrome")){
		  driver=new ChromeDriver();
	  } 
	  else if (browserName.equalsIgnoreCase("firefox")){
		  driver=new FirefoxDriver();
	  } 
	  else if (browserName.equalsIgnoreCase("edge")){
		  driver=new EdgeDriver();
	  } 
	  else {
		  System.out.println("please make sure you have correct browsr");
	  }  
	}
	  @BeforeMethod
	  public void openurl() throws IOException{
		  driverInitilize();
		  //ths driver have scope
		  
		  String urlName=prop.getProperty("url");
		  driver.get(urlName);
	  }
	  @AfterMethod
	  public void closeBrowser() throws IOException{
		  driver.quit();
	  }
	  
	  



	
	}
	  

