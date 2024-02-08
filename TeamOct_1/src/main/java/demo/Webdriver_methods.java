package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_methods {
	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//using manage window maximize
		driver.manage().window().maximize();
		
		//get url
		driver.get("https://www.hyrtutorials.com/");
		
		
		//get current url
		String url=driver.getCurrentUrl();
		System.out.print(url);
		
		//pagesource
		System.out.print(driver.getPageSource());
		
		//gettitle
		driver.getTitle();
		System.out.print(driver.getTitle());
		
		//windowhandle
		System.out.print(driver.getWindowHandle());
		
		//navigateforward
		driver.findElement(By.xpath("//select[@id='selectnav2']")).click();
		
		Thread.sleep(2000);
		
		//navigatebackward
		driver.navigate().back();
		
		//close
		driver.close();
		
		
		
	}

}
