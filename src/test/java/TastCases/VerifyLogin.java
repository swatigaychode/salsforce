package TastCases;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constant;


public class VerifyLogin extends BaseClass{
	SoftAssert a=new SoftAssert();
	@Test(dataProvider="testData")
	 public void login(String username, String password, Object a) throws IOException {
  LoginPageObject obj = new LoginPageObject(driver);
 CommonMethod.handleAssertions(driver.getCurrentUrl(),"https://login.salesforc.com/","url is not matching");
  //LoginPageObject obj=new LoginPageObject(driver);
		obj.enterusername().sendKeys("swati");
		obj.enterpassword().sendKeys("swati@2000");
		obj.clickOnlogin().click();
		obj.clickOntryforFree().click();
		CommonMethod.handleAssertions(obj.erroeText().getText(), Constant.expectedErrormessage ,"error message is not matching");
		((SoftAssert) a).assertAll();
	  
	}
 @DataProvider
  public Object[][] testData() {
  Object[][] data = new Object[2][2];
  data[0][0] = Constant.username;
  data[0][1] = Constant.password;
  data[1][0] = Constant.username;
  data[1][1]=Constant.password;
  return data;
	 
	}

    }

