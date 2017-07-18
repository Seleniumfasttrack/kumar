package ch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cb {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		d.findElementById("txtUsername").sendKeys("Admin");
		d.findElementById("txtPassword").sendKeys("admin");
		d.findElementById("btnLogin").click();
		d.findElementByLinkText("Leave").click();
		d.findElementByLinkText("Leave List").click();
		Thread.sleep(4);
		WebElement rak=d.findElementByXPath(".//*[@id='leaveList_chkSearchFilter_checkboxgroup']");
		List<WebElement> kumar=rak.findElements(By.tagName("input"));
		System.out.println(kumar.size());
		for (int i = 0; i < kumar.size(); i++) {
	if (kumar.get(i).getAttribute("value").equals("-1"))
	{
		kumar.get(i).click();
	
	}
			System.out.println(kumar.get(i).getAttribute("checked")+"...."+kumar.get(i).getAttribute("value"));
		}
		

	}

}
