package ch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButtons {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
			d.get("http://www.echoecho.com/htmlforms10.htm");
			WebElement radio=d.findElementByXPath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td");
			List<WebElement> radioList=radio.findElements(By.name("group1"));
			System.out.println(radioList.size());
			for (int i = 0; i < radioList.size(); i++) {
				radioList.get(i).click();
				for (int j = 0; j <radioList.size(); j++) {
					System.out.println(radioList.get(j).getAttribute("checked")+"..."+radioList.get(j).getAttribute("value"));
					
				}
				
			}
			

	}

}
