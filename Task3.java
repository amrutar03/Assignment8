package Assignment8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(opt);
	
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement footerlink=driver.findElement(By.xpath("//a[@rel='async']"));
	    footerlink.click();
	    WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
	    firstname.sendKeys("Amruta");
	    WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
	    lastname.sendKeys("Amruta"); 
	   WebElement mobilenum=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	   mobilenum.sendKeys("amruta1299@gmail.com"); 
	   WebElement rententerEmail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	   rententerEmail.sendKeys("amruta1299@gmail.com"); 
	   WebElement pwd=driver.findElement(By.xpath("//input[@id='password_step_input']"));
	    pwd.sendKeys("Sham126"); 
	    WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='day']"));
	    Select dropdown = new Select(dropdownElement);
	    dropdown.selectByValue("22");
	    Thread.sleep(2000);
	    WebElement dropdownElement2 = driver.findElement(By.xpath("//select[@id='month']//following::option[text()='Feb']"));
	    dropdownElement2.click();
	    WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	    Select dropdown3 = new Select(year);
	    dropdown3.selectByValue("1990");
	    WebElement radioBtn=driver.findElement(By.xpath("//label[text()='Female']")); 
	
	    if(!radioBtn.isSelected())
	    {
	    	radioBtn.click();
	    }
	
	    WebElement signinBTN=driver.findElement(By.xpath("//button[@name='websubmit']")); 
	    signinBTN.click();
	}

}
