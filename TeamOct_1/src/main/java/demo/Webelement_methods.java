package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class Webelement_methods {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://trytestingthis.netlify.app/");
	WebElement checkbox=driver.findElement(By.id("male"));
checkbox.click();
System.out.println(checkbox.isSelected());
WebElement text= driver.findElement(By.xpath("//h1[text()='Your Website to practice Automation Testing']"));
			System.out.println(text.isDisplayed());
			
			
 }
}
	
