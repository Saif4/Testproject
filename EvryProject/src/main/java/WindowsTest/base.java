package WindowsTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

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
			
			
			}
		
	
	


	}

 
	
		
		
		
	
	
	


