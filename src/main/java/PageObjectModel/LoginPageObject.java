package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	//thid drivr dont have a scope public Webdriverdriver;
		public WebDriver driver;
		 private By username=By.xpath("//input[@id='username']");
		 private By password=By.xpath("//input[@id='password']");
		 private By login=By.xpath("//input[@id='Login']");
		 private By errorMessage=By.xpath("//div[@id='error']");
		 private By tryforFree=By.xpath("//a[@id=\"signup_link\"]");
		 public LoginPageObject(WebDriver driver2) {
			 this.driver=driver2;    
			 }
		 public WebElement enterusername() {
				return driver.findElement(username);
				 }
		 public WebElement enterpassword() {
		return driver.findElement(password);
		 }
		 public WebElement clickOnlogin() {
				return driver.findElement(login);
				 }
		 public WebElement clickOntryforFree() {
				return driver.findElement(tryforFree);
				 }
		 public WebElement erroeText() {
				return driver.findElement(errorMessage);
				 }
		public WebElement errortext() {
			// TODO Auto-generated method stub
			return null;
		}
		public WebElement selectUserTitle() {
			// TODO Auto-generated method stub
			return null;
		}
		 
				
			
		 

}
