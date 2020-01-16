package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepository.Homepage;


public class PGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" , "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Homepage hp=new Homepage(driver);
		
		hp.srch().sendKeys("top 10 maven");
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='erkvQe']/li[2]/div/div[2]/div/span")));
		WebElement ele=driver.findElement(By.xpath("//ul[@class='erkvQe']/li[2]/div/div[2]/div/span"));
		ele.click();
		System.out.println(driver.getTitle());
	
	}

}
