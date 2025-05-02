package Practice12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.internal.Arguments;

import graphql.language.Argument;

public class new1 {
	 
	@Test
	public void sample(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement e=driver.findElement(By.xpath("//button[text()='Point Me']"));
		
		JavascriptExecutor java=(JavascriptExecutor) driver;
		
//		java.executeScript("arguments[0].scrollIntoView(true);", e);
//		e.click();
		
//		Actions a=new Actions(driver);
//		a.scrollToElement(e).perform();
		
		//java.executeScript("window.scrollBy(0, 300);");
		java.executeScript("window.scrollTo(0, 500);");
		java.executeScript("window.scrollBy(500,800);");
		java.executeScript("window.scrollBy(800,1000);");
		
		
		
		
		
	}

}
