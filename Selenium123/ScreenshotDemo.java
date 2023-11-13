package Selenium123;

import java.io.IOException;
import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// Create a file at the destination and store the screenshot there.
		// ./ to take current project folder structure
		
		File destFile = new File("./Screenshots/opera.png");
		FileUtils.copyFile(srcFile,  destFile);
		driver.close();

	}

}
