package Frame;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {
public static AndroidDriver<AndroidElement> cap() throws MalformedURLException {
	DesiredCapabilities dc = new DesiredCapabilities();
	
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "arha");
	
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	
	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.apkmirror.helper.prod");
	
	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.apkmirror.presentation.start.StartActivity");
	
	
	AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	
	return driver;
	

	
	
}

}


