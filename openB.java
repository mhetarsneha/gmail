import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;

public class openB {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
		driver.get("http://www.gmail.com");		
		driver.findElement(By.id("identifierId")).sendKeys("s.mhetar4847@gmail.com");
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
	
		driver.findElement(By.name("password")).sendKeys("sneha4847");
		driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).click();
		
		Thread.sleep(5000);
		/*
		// ... compose mail goes here 
	//	driver.findElement(By.className("T-I J-J5-Ji T-I-KE L3")).click();
		driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		//driver.findElement(By.xpath("//*[@id=\":lc\"]/div/div")).click();
		
		Thread.sleep(5000);	
		driver.findElement(By.id(":q0")).sendKeys("snehamhetar4847@gmail.com");
		driver.findElement(By.xpath("//*[@class='aoT']")).sendKeys("test email");
		driver.findElement(By.xpath("//*[@class='Am Al editable LW-avf']")).sendKeys("test main matter goes here ");
		driver.findElement(By.id(":p8")).click();
	
		 try{
		        if( driver.findElement(By.xpath("//*[@class='ag a8k']")).isDisplayed()){
		          System.out.println("Element is Visible");}
		          else{
		 		     System.out.println("Element is InVisible");
		        }
		}catch(NoSuchElementException e)
		 {
			  System.out.println("Element is InVisible");
		 }
		 */
		 
		//** signout 
		 //driver.findElement(By.xpath("//*[class='gb_ya gbii']")).click();
		 
		 driver.findElement(By.id("gb_71")).click();
			
			driver.close();
		 
	}
}
		  
		
		

