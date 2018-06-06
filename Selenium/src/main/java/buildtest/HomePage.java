package buildtest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
}
	@BeforeTest
	public void homebuildpage() {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kbits-sjc10.aka.amazon.com");
	driver.findElementByName("username").sendKeys("harishas");
	driver.findElementByName("password").sendKeys("M@nage@1234");
	driver.findElementByXPath("//input[@type='submit']").click();
	}
	@Test
	public void Muscat()
	{
		ChromeDriver driver = new ChromeDriver();
		WebElement ele = driver.findElementByLinkText("Eink");
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
	WebElement ele1 = driver.findElementByLinkText("Mainline");
	ac.moveToElement(ele1).perform();
	WebElement ele2 = driver.findElementByLinkText("juno_sbr_muscat_wario");
	ac.moveToElement(ele2).click().build().perform();
	driver.findElementByPartialLinkText("OFFICIAL").click();
	driver.findElementByXPath("//img[contains(@src,'/static/img/icons/folder.png')]").click();
	driver.findElementByXPath("(//span[@class='title-name'])[667]").click();
		

	}
}

