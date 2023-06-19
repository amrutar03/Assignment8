package Assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task2 {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(opt);
	
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement footerlink=driver.findElement(By.xpath("//div[@id='pageFooter']"));
	    String allFooterLink=footerlink.getText();
	    System.out.println("All footer link is::: "+allFooterLink);
	    
        WebElement createPageLink=driver.findElement(By.xpath("//div[@id='pageFooterChildren']//following::a[contains(@href,'/pages/create')]"));
     
     if(createPageLink.isDisplayed())
     {
    	 createPageLink.click();
    	 System.out.println("Create Page link  Present");
     }else {
    	 System.out.println("Create Page link Not Present");
     }
     
	}

}
