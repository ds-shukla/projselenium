package P1;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cleartrip
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		if(driver.findElement(By.id("OneWay")).isDisplayed())
		{
			System.out.println("Radio button is displayed");
			if(driver.findElement(By.id("OneWay")).isEnabled())
			{
				System.out.println("Radio button is editable");
				if(driver.findElement(By.id("OneWay")).isSelected())
				{
					System.out.println("Radio button is selected");
				}
				else
				{
					System.out.println("Radio button is not selected");
				}
			}
			else
			{
				System.out.println("Radio button is not ediatble");
			}
		}
		else
		{
			System.out.println("Radio button is not displayed");
		}
				
	}

}
