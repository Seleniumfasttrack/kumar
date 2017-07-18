package ch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleWindows {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.online.citibank.co.in/");
		String mw= d.getWindowHandle();
		System.out.println(mw);

		d.findElementByXPath(".//*[@id='nav']/ul[3]/li/a/span[2]").click();
		Set<String> mws=d.getWindowHandles();
		System.out.println(mws);
		Iterator<String> it= mws.iterator();
		while (it.hasNext()) {
			String cw = it.next().toString();
			if (!mw.equals(cw)) {
				d.switchTo().window(cw);
				d.findElementById("User_Id").sendKeys("12345678");
				
			}
			
		}
	}

}
