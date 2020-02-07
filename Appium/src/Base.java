import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//Section take 60sec to close
		//Close the connection to start again (to close ctrl+c)
		//Cd C:\Users\robert\AppData\Local\Android\Sdk\platform-tools>emulator -avd RobertEmulator
		
		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
		
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(MobileCapabilityType.DEVICE_NAME, "RobertEmulator");
		cp.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL ("http://192.168.0.10:4723/wd/hub"),cp);
		
		//AnroidUIAutomator
		//C:\Users\robert\AppData\Local\Android\Sdk\tools\bin uiautomatorviewer (click on it)
}
	
	
}
