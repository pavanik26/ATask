package pack23;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {
	
	public static void main(String[] args)
	{
		//locator();
		//linkText();
		//partialLinkText();
		//CountofLinks();
		//getTextOfElement();
		//getTextOfElementNotRetrieved();
		//getTextOfElements();
		//radioButton();
		//checkBoxes();
		//handleDoubleQuote();
		//actionConcept();
		//dragAndDrop();
		//assignmentTask();
		//assignmentTask2();
		//assignmentTask3();
		//alert();
		//newTab();
		//assignment4();
		//htmlTable();
		assignmentWatcho();
	}
	
	public static void locator()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.name("url")).click();
        driver.quit();
	}
	
	
	public static void linkText()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Images")).click();
        waitForElement(2000);
        driver.navigate().back();
        waitForElement(2000);
        driver.findElement(By.linkText("Gmail")).click();
        waitForElement(2000);
        driver.findElement(By.linkText("Sign in")).click();
        waitForElement(2000);
        driver.quit();
        
      }
	
	public static void CountofLinks()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
		/*
		 * List<WebElement> link = driver.findElements(By.tagName("a")); int count =
		 * link.size(); System.out.println("links are" +count); driver.quit();
		 */
        
        List<WebElement> lst= driver.findElements(By.xpath("//textarea"));
        int size = lst.size();
        System.out.println("Text area are"  + size);
        
       driver.findElement(By.xpath("//textarea[1]")).sendKeys("rose");
        
      }
	
	public static void partialLinkText()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("mag")).click();
        waitForElement(2000);
        driver.navigate().back();
        waitForElement(2000);
        driver.findElement(By.linkText("Gmail")).click();
        waitForElement(2000);
        driver.findElement(By.linkText("Sign in")).click();
        waitForElement(2000);
        driver.quit();
        
      }
	
	public static void getTextOfElement()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String linktxt=driver.findElement(By.linkText("Gmail")).getText();
        waitForElement(2000);
        System.out.println("Link text " +linktxt);
        if(linktxt.equalsIgnoreCase("gmail"))
        {
        	System.out.println("landed in correct page");
        }
        else
        {
        	System.out.println("landed in incorrect page");
        }
        driver.quit();
        
      }
	
	public static void getTextOfElementNotRetrieved()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com/intl/en-US/gmail/about/");
        driver.manage().window().maximize();
        String txt=driver.findElement(By.xpath("//img[@title='Google']")).getAttribute("alt");
        waitForElement(2000);
        System.out.println("Link text " +txt);
        driver.quit();
		
		  if(txt.equalsIgnoreCase("google")) {
		  System.out.println("landed in correct page"); } else {
		  System.out.println("landed in incorrect page"); }		 
       
        
      }
	
	public static void getTextOfElements()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        List<WebElement> test=driver.findElements(By.xpath("//div[@class='gb_Z gb_0']/a"));
        int linkcount = test.size();
        waitForElement(2000);
        System.out.println("Link text " +linkcount);
        for (int i=0;i<linkcount;i++)
        {
        	String text = test.get(i).getText();
        	System.out.println("links are " + text);
        }
        driver.quit();       
        
      }
	
	public static void radioButton()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://materializecss.com/radio-buttons.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Yellow']")).click();
        List<WebElement> lstr = driver.findElements(By.xpath("//input[@type='radio']//parent::label"));
        System.out.println("total radio buttons " + lstr.size());
        for (int i=0; i<lstr.size() ; i++)
        {
        	waitForElement(2000);
        	lstr.get(i).click();
        	
        }
        driver.quit();	  
		 
       
        
      }
	
	public static void checkBoxes()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//span[text()='Yellow']")).click();
        List<WebElement> lstr = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("total checkboxes " + lstr.size());
        for (int i=0; i<lstr.size() ; i++)
        {
        	waitForElement(2000);
        	lstr.get(i).click();
        	
        }
        driver.quit();	  
		 
       
        
      }
	
	public static void handleDoubleQuote()
	{
		

        // Navigate to a website
        System.out.println("Hello World");
        System.out.println("\"Hello World\"");
       
        
      }
	
	public static void actionConcept()
	{
		

       WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.snapdeal.com");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//span[text()='Yellow']")).click();
       Actions action = new Actions(driver);
       WebElement element = driver.findElement(By.xpath("//span[contains(text(), 'Home & Kitchen')]"));
       //element.click();
      // action.moveToElement(element).build().perform();
       action.doubleClick(element).build().perform();
       //action.moveToElement(null).click();
       
       action.contextClick(element).build().perform();
      
       
       System.out.println("element clicked");
        driver.quit();
      }
	
	public static void dragAndDrop()
	{
		

       WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//span[text()='Yellow']")).click();
        
        WebElement elm = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(elm);
       Actions action = new Actions(driver);
       WebElement source = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
       WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
       
       action.dragAndDrop(source, target).build().perform();    
       waitForElement(4000);
       driver.switchTo().defaultContent();
      
        driver.quit();
      }
	
	public static void assignmentTask()
	{
		

       WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement signInElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-link-accountList']")));
        actions.moveToElement(signInElement).perform();
       
        WebElement youraccount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(), 'Your Account')]")));
        actions.click(youraccount).build().perform();     
       
      if(driver.findElements(By.xpath("//h1[contains(text(), 'Your Account')]")).size()>0)
      {
      System.out.println("landed on correct page");
      }
      else
      {
    	  System.out.println("landed on incorrect page");
      }     
      
       waitForElement(4000);      
      
        driver.quit();
      }
	
	public static void assignmentTask2()
	{
		

       WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();		
		 
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com");
        driver.navigate().back();
        
        waitForElement(4000);
        driver.navigate().forward();

        waitForElement(4000);   
        
		
		  int img= driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']/*[@href]/div/div/div/div[@class='_2GaeWJ']/img")).size();
		  
		  System.out.println("count of images is:" + img);
		  
		  int text= driver.findElements(By.xpath("//span[@class='_1XjE3T']")).size();
		  
		  System.out.println("count of text is :" + text);
		  
		  int totalcount = img+text;
		  
		  System.out.println("count of images and text :" + totalcount);       
        
        
        List<WebElement> textNames = driver.findElements(By.xpath("//span[@class='_1XjE3T']"));
        for (WebElement element : textNames) {
            String textOfferNames = element.getText();
            System.out.println(textOfferNames);
        }
        
        driver.quit();
      }
	
	public static void assignmentTask3()
	{
		

       WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();		
		 
           
        driver.get("https://www.shiksha.com");
        driver.manage().window().maximize();
        
        
        waitForElement(4000);
       
        String rgbaActualColor = driver.findElement(By.id("_globalNav"))
                .getCssValue("background-color");
		  
		  System.out.println("background color is :" + rgbaActualColor);       
      
        
        driver.quit();
      }
	
	public static void alert()
	{
		

        WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();		
		 
           
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        driver.manage().window().maximize();
        
//        
//       
//       
//       driver.findElement(By.xpath("//a[@id='alert']")).click();
//       waitForElement(4000);
//       driver.switchTo().alert().accept();
//		 
//       
//       driver.findElement(By.id("confirm")).click();
//       waitForElement(4000);
//       driver.switchTo().alert().dismiss();
		 
       driver.findElement(By.id("prompt")).click();
       waitForElement(4000);
       // Wait for the alert to be present
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       Alert alert = wait.until(ExpectedConditions.alertIsPresent());
       driver.switchTo().alert();
       alert.sendKeys("test");
       waitForElement(4000);
       System.out.println("text entered");
       String text = driver.switchTo().alert().getText();
       System.out.println("text" +text);
       waitForElement(10000);
       driver.switchTo().alert().accept();
      
		 
        driver.quit();
      }
	
	public static void newTab()
	{
		

        WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();		
		 
           
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
        driver.manage().window().maximize();    

		 
       driver.findElement(By.xpath("//a[normalize-space()='Create documentation issue']")).click();
       waitForElement(4000);
       List<String> tabs = new ArrayList<>(driver.getWindowHandles());

       // Switch to the new tab (the second tab)
       driver.switchTo().window(tabs.get(1));

       // Now you can interact with elements in the new tab
       System.out.println("Title of new tab: " + driver.getTitle());

       //String text=driver.findElement(By.xpath("//h1")).getText();
       System.out.println("text in tab2 is " +driver.findElement(By.xpath("//h1")).getText());	
       
       driver.switchTo().window(tabs.get(0));
       waitForElement(4000);
       
       System.out.println("text in original tab is " +driver.findElement(By.xpath("//h1")).getText());	
       
        driver.quit();
      }
	
	public static void assignment4()
	{
		

        WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();		
		 
           
        driver.get("https://www.naukri.com");
        driver.manage().window().maximize();    

		 
       String logoColor=driver.findElement(By.xpath("//img[@alt='Naukri Logo']")).getCssValue("color");
       waitForElement(4000);
      
       // Now you can interact with elements in the new tab
       System.out.println("Color of logo is: " + logoColor);

       String imgColor=driver.findElement(By.xpath("//img[@alt='awareness']")).getCssValue("color");    
       //String backgroundColor = parentElement.getCssValue("background-color");
       
       
       System.out.println("Color of text is: " + imgColor);
       
        driver.quit();
      }
	
	public static void htmlTable()
	{
		

        WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();		
		 
           
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();    

		 
      List<WebElement> companyNames=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
//      for(int index=0;index<companyNames.size();index++)
//      
//    	  if(companyNames.get(index).getText().equalsIgnoreCase("Island Trading"))
//         {
//    		  
//    		 System.out.println("company name : "  +companyNames.get(index).getText());
//    		  
//  
//      }
      for (WebElement cname : companyNames )
      if (cname.getText().equalsIgnoreCase("Island Trading"))
    {
    	  System.out.println("company name : "  + cname.getText());
//		  

      }
       waitForElement(4000);
      
      
       
        driver.quit();
      }
	
  public static List<WebElement> checkCompanyNames(WebDriver driver)
  {
	  List<WebElement> companyNames=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
	  return companyNames;
  }
  
  public static void assignmentWatcho()
	{
		

      WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();		
		 
         
      driver.get("https://www.google.com");
      driver.manage().window().maximize();    
       
      // Locate the search box
      WebElement txtSearch = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

      // Enter the search term and submit
      txtSearch.sendKeys("WATCHO plans");
      txtSearch.sendKeys(Keys.RETURN);
      
     //Click on the first search result link
      WebElement firsLink = driver.findElement(By.xpath("//div[@role='heading']//span[contains(text(),'Watcho Plans')]"));
      firsLink.click();
		 
       waitForElement(4000);
    
      

       //find src
       WebElement logo = driver.findElement(By.xpath("(//img[@role='button'])[1]"));
       String logosrc = logo.getAttribute("src");
       System.out.println("Logo src : "  + logosrc);
       //logo.click();
     
    
       //WebElement plans = driver.findElement(By.xpath("//a[normalize-space()='OTT PLANS']"));
       //plans.click();
       
       
       
       int plancount = driver.findElements(By.xpath("//div[@class='pricing-card-section']")).size();
       System.out.println("plan count : "  + plancount);
       waitForElement(4000);
       
       
       
       WebElement subscription = driver.findElement(By.xpath("(//button[@class='cta-btn'][normalize-space()='Subscribe Now'])[1]"));
       subscription.click();
       waitForElement(4000);
       
       WebElement txtMobile = driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
       txtMobile.sendKeys("1234567890");
       
       WebElement btnOTP = driver.findElement(By.xpath("//button[@class='btn_otp desktop-view']"));
       btnOTP.click();
       
      driver.quit();
    }

	
	public static void waitForElement(int milliseconds)
	{
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
