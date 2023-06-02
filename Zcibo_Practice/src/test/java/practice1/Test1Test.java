package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1Test {
	
	WebDriver driver;
	@Test
	public void m1() {
		
		String BROWSER = System.getProperty("Browser");
		String URL = System.getProperty("url");
		
		 
		 if(BROWSER.equalsIgnoreCase("Chrome")) 
		 {
			
			 driver=new ChromeDriver();
	 }else
	 {
		 driver=new FirefoxDriver();
	 } 
		
		
		
		System.out.println("hi");
	}
	@Test
	public void m2() {
		System.out.println("***********second method ************");
		System.out.println("******************************************");
	}
	@Test
	public void chromemethode() {
		System.out.println("-------------chrome methode executed----------- ");
	}
	
	

}
