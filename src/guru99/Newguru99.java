package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newguru99 {
	
	public static void main(String[]args) {
		
		//String chrpath="C:\\Users\\KOKU-NIPUNI\\Downloads\\chromedriver_win32.zip";
		//System.setProperty("","C:\\Users\\KOKU-NIPUNI\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KOKU-NIPUNI\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		
		driver.manage().window().maximize();
		
		WebElement submit = driver.findElement(By.linkText("Register"));		
		submit.click();
		
		Select title =  new Select(driver.findElement(By.name("title")));
		title.selectByVisibleText("Miss");
		
		
		WebElement f_name = driver.findElement(By.name("firstname"));
		WebElement s_name = driver.findElement(By.name("lastname"));
		WebElement phone = driver.findElement(By.name("phone"));
		
		f_name.sendKeys("Nipuni");
		s_name.sendKeys("Senanayake");
		phone.sendKeys("765428190");
		
		
		Select yr =  new Select(driver.findElement(By.name("year")));
		yr.selectByVisibleText("1994");
		
		Select month =  new Select(driver.findElement(By.name("month")));
		month.selectByVisibleText("August");
		
		Select date =  new Select(driver.findElement(By.name("date")));
		date.selectByVisibleText("16");
		
		Select occupation =  new Select(driver.findElement(By.name("occupation")));
		occupation.selectByVisibleText("Academic");
		
		WebElement radio = driver.findElement(By.id("licencetype_f"));
		radio.click();
		
		
		Select licence_period =  new Select(driver.findElement(By.name("licenceperiod")));
		licence_period. selectByIndex(1);
		
		WebElement street = driver.findElement(By.name("street"));
		WebElement city = driver.findElement(By.name("city"));
		WebElement country = driver.findElement(By.name("county"));
		WebElement postcode = driver.findElement(By.name("post_code"));
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement confirm_password = driver.findElement(By.name("c_password"));
		
		street.sendKeys("Pethiyagoda");
		city.sendKeys("Colombo");
		country.sendKeys("Sri Lanka");
		postcode.sendKeys("270/B");
		email.sendKeys("nchamathka@gmail.com");
		password.sendKeys("ncs1234");
		confirm_password.sendKeys("ncs1234");
		
		WebElement create = driver.findElement(By.name("submit"));		
		create.click();
		
		//Login
		WebElement mail = driver.findElement(By.name("email"));
		mail.sendKeys("nchamathka@gmail.com");
		
		WebElement passwd = driver.findElement(By.name("password"));
		passwd.sendKeys("ncs1234");
		
		WebElement log_in = driver.findElement(By.name("submit"));		
		log_in.click();
		
		
		//compare
		WebElement value= driver.findElement(By.xpath("//h4[contains(text(),\"nchamathka@gmail.com\")]"));
        String expected = "nchamathka@gmail.com";
        String actual = value.getText();
        System.out.println(actual);    
        
    if(expected.equals(actual)) {
        System.out.println("PASS");
        
    }
    
    else {
        System.out.println("FAIL");
    }
    
	}
	

}
