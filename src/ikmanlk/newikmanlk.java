package ikmanlk;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class newikmanlk {

	public static void main(String[]args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KOKU-NIPUNI\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://ikman.lk/");

		driver.manage().window().maximize();

		WebElement vehicles = driver.findElement(By.xpath("//span[contains(text(),\"Vehicles\")]"));
		vehicles.click();

		WebElement cars = driver.findElement(By.xpath("(//span[@class=\"text\"])[3]"));
		cars.click();

		WebElement brand = driver.findElement(By.xpath("//span[contains(text(),\"Brand\")]"));
		brand.click();

		WebElement brandT = driver.findElement(By.xpath("//input[@id=\"brand-filter\"]"));
		brandT.sendKeys("Toyota");



		WebElement toyota6109 = driver.findElement(By.xpath("//li[@key=\"toyota\"]"));
		toyota6109.click();

		//input[@id='brand-filter']/following-sibling::div[@class='auto-list']/child::ul/child::li[@key='toyota']

		WebElement chr = driver.findElement(By.xpath("//input[@id=\"model-filter\"]"));

		Thread.sleep(2000);

		chr.sendKeys("CHR");

		WebElement chr3 = driver.findElement(By.xpath("//li[@key=\"toyota-ch-r\"]"));
		chr3.click();

		WebElement button = driver.findElement(By.xpath("//button[@class=\"ui-btn is-standard btn-apply-brand\"]"));
		button.click();




		//Select model = new Select(driver.findElement(By.xpath("//input[@id=\"model-filter\"]")));
		//model.selectByVisibleText("CHR");

		//Select brandT = new Select(driver.findElement(By.xpath("fruits")));
		//brandT.selectByVisibleText("Toyota(6101)");

		//WebElement button = driver.findElement(By.xpath("//button[@class=\"ui-btn is-standard btn-apply-brand\"]"));
		//button.click();

		/*List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"ui-item\"]"));
        int itemsCount = list.size();
        {
           System.out.println("Total number of Advertisements are:-" + itemsCount);
        }*/


		/*List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"ui-item\"]"));
		int itemcount = list.size();

		for (int i = 0; i < 12; i++) {
			WebElement next = driver.findElement(By.xpath("//span[contains(text(),\"Next\")]"));
			list = driver.findElements(By.xpath("//div[@class=\"ui-item\"]"));
			next.click();

			itemcount = itemcount + list.size();
			System.out.println("Total number of Advertisements are:" + itemcount);
			//itemcount = itemcount + list.size();
			 
*/	
		List<WebElement> list = driver.findElements(By.xpath("//a[@class=\"pag-number\"]"));
		int itemcount = list.size();

		for (int i = 0; i < list.size(); i++) {
			WebElement next = driver.findElement(By.xpath("//span[contains(text(),\"Next\")]"));
			list = driver.findElements(By.xpath("//div[@class=\"ui-item\"]"));
			next.click();

			itemcount = itemcount + list.size();
			System.out.println("Total number of Advertisements are:" + itemcount);
			//itemcount = itemcount + list.size();
	
	}
	}
}
