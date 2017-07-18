package ch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class checkBox {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.findElementById("remember").click();
		System.out.println(d.findElementById("remember").getAttribute("checked"));
		d.findElementById("remember").click();
		System.out.println(d.findElementById("remember").getAttribute("checked"));

	}

}
