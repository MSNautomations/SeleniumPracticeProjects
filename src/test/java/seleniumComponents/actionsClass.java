package seleniumComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsClass {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement accountlink=driver.findElement(By.id("nav-link-accountList"));
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		
		act.moveToElement(accountlink).perform();
		act.keyDown(searchbox, Keys.SHIFT).sendKeys("mohasin").perform();		
	}

}
