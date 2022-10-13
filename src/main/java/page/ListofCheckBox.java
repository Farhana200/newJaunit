package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListofCheckBox extends Basepage{
	WebDriver driver;
	String geData;
	public void ListofCheckBox(WebDriver driver) {
		this.driver = driver;
	}
    //	WebElement list
	@FindBy(how=How.XPATH,using="//input[@name='allbox']")WebElement TogglechekBox;
	@FindBy(how=How.XPATH,using="//input[@name='data']")WebElement InputData;
	@FindBy(how=How.XPATH,using="//input[@value='Add']")WebElement AddSubmit;
	@FindBy(how=How.XPATH,using="//div[@id='todos-content']")WebElement UpperchekBox;
	@FindBy(how=How.XPATH,using="//input[@value='Remove']")WebElement RemoveButton;
	
	//coresponding method
//	public void toggleCheckBox() {
//	TogglechekBox.click();
//	System.out.println(TogglechekBox.isSelected());
//	}
	
	public void upperCheckBox(String data) throws InterruptedException {
	    geData =data + genarateRandomNum(45);
		InputData.sendKeys(geData);
		AddSubmit.click();
	    geData =data + genarateRandomNum(45);
		InputData.sendKeys(geData);
		AddSubmit.click();
		}
	
	public void toggleCheckBox() {
		TogglechekBox.click();  //click is not working
		System.out.println(TogglechekBox.isSelected());
	}
		
	public void allupperBoxSlect() {
		UpperchekBox.click();
	    System.out.println(UpperchekBox.isSelected());
		
	}
	
	public void validationCheckbox()  {
	if(UpperchekBox==TogglechekBox) {
		System.out.println("Toggle box is working");
	}else{
		System.out.println("ToggleBox is not working");
	}
	}
	
//	public void validationTest1() {
//		
//		List<WebElement>checkBoxTest = driver.findElements(By.xpath("//input[@name='todo[1]']"));//select all cheack box
//		System.out.println(checkBoxTest.size());
//	    for(int i=0;i=checkBoxTest.size();i++) {
//	    	checkBoxTest.g
//	    }
//	
		
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
