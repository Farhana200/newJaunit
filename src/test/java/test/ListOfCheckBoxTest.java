package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ListofCheckBox;
import util.BrowserFactoryFN;

public class ListOfCheckBoxTest {
	WebDriver driver;
	ListofCheckBox listcheckbox;
	String data = "junit";
	@Test
	public void validcheckboxCheck() throws InterruptedException {

		driver = BrowserFactoryFN.init();
		Thread.sleep(5000);
		ListofCheckBox listcheckbox = PageFactory.initElements(driver, ListofCheckBox.class);
		listcheckbox.upperCheckBox(data);
		Thread.sleep(5000);
		listcheckbox.toggleCheckBox();
		listcheckbox.allupperBoxSlect();
		listcheckbox.validationCheckbox();
//		listcheckbox.validationTest1();
		BrowserFactoryFN.tearDown();
		
	}

}
