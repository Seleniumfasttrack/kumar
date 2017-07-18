package ch;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleChecboxes {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.echoecho.com/htmlforms09.htm");
		List<WebElement> checklist=d.findElementsByTagName("input");
		System.out.println(checklist.size());
		for (int i = 0; i < checklist.size(); i++)
		{
		if (checklist.get(i).getAttribute("value").equals("Milk"));
	
			checklist.get(i).click();
		}
	
				
			}
			
		

	}


