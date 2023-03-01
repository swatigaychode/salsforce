package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupPageObject {

	public WebDriver driver;
	private By firstName=By.xpath("//input[@name=\"UserFirstName\"]");
	private By lastName=By.xpath("//input[@name=\"UserLastName\"]");
	private By userEmail=By.xpath("//input[@name=\"UserUserEmail\"]");
	private By UserTitle=By.xpath("//select[@\"name=\"UserTitle\"\"]");
	 
  public signupPageObject(WebDriver driver2) {
	  this.driver=driver2;
  }
	
	public WebElement enterFirstname() {
		return driver.findElement(firstName);
	}
	public WebElement enterLastname() {
		return driver.findElement(lastName);
	}
	public WebElement enteruserEmail() {
		return driver.findElement(userEmail);
	}
	public WebElement selectUserTitle() {
		return driver.findElement(UserTitle);
	}

	public Object clickOntitle() {
		// TODO Auto-generated method stub
		return null;
	}

	
		
	
	
	
	
}