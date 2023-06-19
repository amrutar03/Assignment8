package Assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task1 {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(opt);
	
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement textmsg=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you ')]"));
	    String msg=textmsg.getText();
	    System.out.println("FaceBook Text is :::"+msg);
	    String desiredText="Facebook helps you connect and share with the people in your life";
	    if(msg.contains(desiredText))
	    {
	    	System.out.println("The desired text is present on the webpage.");
	    }else {
	    	System.out.println("The desired text is NOT present on the webpage.");
	    }
	    
	}

}
