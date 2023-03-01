package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethod {
	
	public static void selectDropdown(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);}
	public static void handleAssertions(String actual,String expected,String message) {
		
		SoftAssert Assert = new SoftAssert();
		String ac=actual;
		String exp=expected	;	
		Assert.assertEquals(ac,exp,message);
		Assert.assertAll(); //this is fix line this is mandtory
		
	}
		
	


}