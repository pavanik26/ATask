package pack23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumJ {
	
	public static void main(String[] args)
	{
		firstMethod();
	}
	
	public static void firstMethod()
	{
		WebDriverManager.chromedriver().setup();

        // Create ChromeOptions instance
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Optional: Start browser maximized

        // Initialize ChromeDriver with options
        WebDriver driver = new ChromeDriver(options);

        // Navigate to a website
        driver.get("https://www.google.com");
        waitForElement(5000);
        
        
        
       // System.out.println("Title: " + driver.getTitle());
        // Perform any actions if needed, e.g., searching or clicking
        
        driver.findElement(By.id("APjFqb")).sendKeys("rose");
        
        // Close the browser
        driver.quit();
		
	}
	
	public static void waitForElement(int milliseconds)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}