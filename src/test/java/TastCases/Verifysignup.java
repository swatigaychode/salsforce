package TastCases;

import java.io.IOException;

import javax.swing.text.StyleConstants.CharacterConstants;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.signupPageObject;
import Resources.BaseClass;
import Resources.Constant;
import bsh.org.objectweb.asm.Constants;

@Test
public class Verifysignup extends BaseClass{
 
	private static final String CommonMethods = null;

	public void signup() throws IOException, InterruptedException {
	  
	  LoginPageObject obj=new LoginPageObject(driver);
	  
	  obj.clickOntryforFree().click();
	  
	  signupPageObject obj1=new signupPageObject(driver);
	  
	  Thread.sleep(5000);
	  
	  obj1.enterFirstname().sendKeys(Constant.firstName);
	  obj1.enterLastname().sendKeys(Constant.lastName);
	  obj1.enteruserEmail().sendKeys(Constant.userEmail);
	
	  obj1.selectUserTitle();
	  
	    selectDropdown(obj1.clickOntitle(),"Developer");
	    
	    
	  
	    Select s=new Select(obj.selectUserTitle());
	  s.selectByIndex(1);
	  
	 
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 }

	private void selectDropdown(Object clickOntitle, String string) {
		// TODO Auto-generated method stub
		
	}

	}

	

