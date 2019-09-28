package P1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class ComposeMail
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("identifier")).sendKeys("deepashukla0512@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Myra@704209");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		//code to compose& send a mail, and signout from gmail
		
		/*driver.findElement(By.xpath("//div[@gh='cm']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("to")).sendKeys("shukladeepa05@gmail.com");	
		driver.findElement(By.name("subjectbox")).sendKeys("Hi There!");
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("This is a test mail");
		driver.findElement(By.xpath("//div[@class='dC']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='gb_Ba gbii']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();*/
		
		//code to select any particular mail by its position
		driver.findElement(By.xpath("(//div[@role='checkbox'])[5]")).click();
		
	}

}
