package buildtest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BuildDownload {
	@Test (priority = 1)
	public void muscat() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kbits-sjc10.aka.amazon.com");
		driver.findElementByName("username").sendKeys("harishas");
		driver.findElementByName("password").sendKeys("M@nage@1234");
		driver.findElementByXPath("//input[@type='submit']").click();
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
	
	@Test (priority = 2)
	public void pinot() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kbits-sjc10.aka.amazon.com");
		driver.findElementByName("username").sendKeys("harishas");
		driver.findElementByName("password").sendKeys("M@nage@1234");
		driver.findElementByXPath("//input[@type='submit']").click();
		WebElement ele = driver.findElementByLinkText("Eink");
        Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
		WebElement ele1 = driver.findElementByLinkText("Mainline");
		ac.moveToElement(ele1).perform();
		WebElement ele2 = driver.findElementByLinkText("juno_sbr_pinot_wario");
		ac.moveToElement(ele2).click().build().perform();
		driver.findElementByPartialLinkText("OFFICIAL").click();
		driver.findElementByXPath("//img[contains(@src,'/static/img/icons/folder.png')]").click();
		driver.findElementByXPath("(//span[@class='title-name'])[663]").click();
	}
	
	@Test (priority = 3)
	public void icewine() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kbits-sjc10.aka.amazon.com");
		driver.findElementByName("username").sendKeys("harishas");
		driver.findElementByName("password").sendKeys("M@nage@1234");
		driver.findElementByXPath("//input[@type='submit']").click();
		WebElement ele = driver.findElementByLinkText("Eink");
        Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
		WebElement ele1 = driver.findElementByLinkText("Mainline");
		ac.moveToElement(ele1).perform();
		WebElement ele2 = driver.findElementByLinkText("juno_sbr_icewine_wario");
		ac.moveToElement(ele2).click().build().perform();
		driver.findElementByPartialLinkText("OFFICIAL").click();
		driver.findElementByXPath("//img[contains(@src,'/static/img/icons/folder.png')]").click();
		driver.findElementByXPath("(//span[@class='title-name'])[669]").click();
	}

	@Test (priority = 4)
	public void whisky() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kbits-sjc10.aka.amazon.com");
		driver.findElementByName("username").sendKeys("harishas");
		driver.findElementByName("password").sendKeys("M@nage@1234");
		driver.findElementByXPath("//input[@type='submit']").click();
		WebElement ele = driver.findElementByLinkText("Eink");
        Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
		WebElement ele1 = driver.findElementByLinkText("Mainline");
		ac.moveToElement(ele1).perform();
		WebElement ele2 = driver.findElementByLinkText("juno_sbr_whisky_duet");
		ac.moveToElement(ele2).click().build().perform();
		driver.findElementByPartialLinkText("OFFICIAL").click();
		driver.findElementByXPath("//img[contains(@src,'/static/img/icons/folder.png')]").click();
		driver.findElementByXPath("(//span[@class='title-name'])[668]").click();
	}
	@Test (priority = 5)
	public void bourbon() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kbits-sjc10.aka.amazon.com");
		driver.findElementByName("username").sendKeys("harishas");
		driver.findElementByName("password").sendKeys("M@nage@1234");
		driver.findElementByXPath("//input[@type='submit']").click();
		WebElement ele = driver.findElementByLinkText("Eink");
        Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
		WebElement ele1 = driver.findElementByLinkText("Mainline");
		ac.moveToElement(ele1).perform();
		WebElement ele2 = driver.findElementByLinkText("juno_sbr_bourbon_wario");
		ac.moveToElement(ele2).click().build().perform();
		driver.findElementByPartialLinkText("OFFICIAL").click();
		driver.findElementByXPath("//img[contains(@src,'/static/img/icons/folder.png')]").click();
		driver.findElementByXPath("(//span[@class='title-name'])[665]").click();
	}
	@Test (priority = 6)
	public void eanab() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kbits-sjc10.aka.amazon.com");
		driver.findElementByName("username").sendKeys("harishas");
		driver.findElementByName("password").sendKeys("M@nage@1234");
		driver.findElementByXPath("//input[@type='submit']").click();
		WebElement ele = driver.findElementByLinkText("Eink");
        Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
		WebElement ele1 = driver.findElementByLinkText("Mainline");
		ac.moveToElement(ele1).perform();
		WebElement ele2 = driver.findElementByLinkText("juno_sbr_eanab_heisenberg");
		ac.moveToElement(ele2).click().build().perform();
		driver.findElementByPartialLinkText("OFFICIAL").click();
		driver.findElementByXPath("//img[contains(@src,'/static/img/icons/folder.png')]").click();
		driver.findElementByXPath("(//span[@class='title-name'])[666]").click();

	}
	@Test (priority = 7)
	public void cognac() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kbits-sjc10.aka.amazon.com");
		driver.findElementByName("username").sendKeys("harishas");
		driver.findElementByName("password").sendKeys("M@nage@1234");
		driver.findElementByXPath("//input[@type='submit']").click();
		WebElement ele = driver.findElementByLinkText("Eink");
        Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
		WebElement ele1 = driver.findElementByLinkText("Mainline");
		ac.moveToElement(ele1).perform();
		WebElement ele2 = driver.findElementByLinkText("juno_sbr_cognac_zelda");
		ac.moveToElement(ele2).click().build().perform();
		driver.findElementByPartialLinkText("OFFICIAL").click();
		driver.findElementByXPath("//img[contains(@src,'/static/img/icons/folder.png')]").click();
		driver.findElementByXPath("(//span[@class='title-name'])[669]").click();
	}
}
	