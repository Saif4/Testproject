package WindowsTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.util.Assert;

import io.appium.java_client.windows.WindowsDriver;

public class base {

	/*public static void main(String[] args) throws MalformedURLException {
		base initialObj = new base();
		{
			initialObj.initialDriver();
		}
	}
	*/
		public WindowsDriver driver;
		
		
		public void initialDriver() throws MalformedURLException {
			
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
			//cap.setCapability("appArguments", "MyTestFile.txt");
			//cap.setCapability("appWorkingDir", "C:\\MyTestFolder\\");
			driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
			//Actions a = new Actions(driver);
			//a.moveToElement(driver.findElementByName("Calculator")).build().perform();
			//WebElement newWindow = driver.findElementByName("Calculator");
			//String newWindowHandle = newWindow.getAttribute("NativeWindowHandle");
			//driver.switchTo().window(newWindowHandle);
			//WebElement ChildWindow = driver.findElementByClassName("Windows.UI.Core.CoreWindow");
			driver.findElementByName("Text Editor").sendKeys("hejjj");
			String te = driver.findElementByAccessibilityId("CalculatorResults").getText();
		    driver.getWindowHandle();
		    driver.switchTo(te);

			
		
		}
	


	}

 
	
		
		
		
	
	
	


