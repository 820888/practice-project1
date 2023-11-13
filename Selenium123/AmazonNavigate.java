package Selenium123;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonNavigate {

	public static void main(String[] args)  throws InterruptedException {
		// Open a Chrome Browser
		// Webdriver is a interface in selenium

		// Create a WebDriver instance for Chrome
		WebDriver driver = new ChromeDriver();

		// Open a website
		driver.get("https://www.amazon.in/");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Get the current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);

		// Get the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);

		// Find and interact with elements on the webpage
		//WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Downloads')]"));
		//element.click();
		

		// Perform some other actions, e.g., navigating back and forward
		driver.navigate().back();
		driver.navigate().forward();
		
		//Thread.sleep(2000);

		// Refresh the current page
		driver.navigate().refresh();
		
		
      
		
		Thread.sleep(1000);
		
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']/descendant::input[1]")).sendKeys("6302282088");
		
		driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']/descendant::input[3]")).sendKeys("AA@1aaas");
		
		driver.findElement(By.xpath("//div[@class='a-box-inner a-padding-extra-large']/descendant::input[5]")).click();
		
		
        
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("iPhone 13");
        Thread.sleep(1000);
        
        WebElement searchBox1 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchBox1.click();
        
        Thread.sleep(2000);
		// Verify the page's ability to scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0,5000)","");
        
        Thread.sleep(2000);
        
        // Scroll up by 500 pixels
        js.executeScript("window.scrollBy(0,-5000)","");
        
        
        Thread.sleep(2000);
        
		// Close the browser window 
		//driver.close();
		driver.findElement(By.linkText("Get It Today")).click();
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']")).click();

		// Quit the WebDriver instance and close all associated windows and processes
		//driver.quit();
	}

}
