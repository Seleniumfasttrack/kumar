package ch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOperations 
{

	public static void main(String[] args) 
	{
	FirefoxDriver d=new FirefoxDriver();
	d.get("http://ceoandhra.nic.in/home.aspx#");
	WebElement pdf=d.findElementByXPath(".//*[@id='myjquerymenu']/ul/li[3]/a");
	
	Actions sunil =new Actions(d);
	sunil.moveToElement(pdf).build().perform();
	sunil.moveToElement(d.findElementByXPath(".//*[@id='myjquerymenu']/ul/li[3]/ul/li[2]/a")).build().perform();
	sunil.moveToElement(d.findElementByXPath(".//*[@id='myjquerymenu']/ul/li[3]/ul/li[2]/ul/li[2]/a")).click().build().perform();
	
	
	}
}

