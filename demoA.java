package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoA {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		//open the browser
	    WebDriver  driver =new ChromeDriver();
	    
	    //maximize the browser
	    driver.manage().window().maximize();
	    
	    //enter the URL or path of html file
	    driver.get("file:///C:/Users/Prathika/Desktop/link.html");
	    
	    String tagname="a";
	    
	    By by = By.tagName(tagname);
	    
	    WebElement link = driver.findElement(by);
	    link.click();
	   
	}

}
