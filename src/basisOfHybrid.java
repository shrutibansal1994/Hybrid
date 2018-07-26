import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class basisOfHybrid {
	public static AppiumDriverLocalService ls;
	public static AndroidDriver<AndroidElement> driver;

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Nexus 6P");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
		cap.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
		// cap.setCapability("app", System.getProperty("User.dir")+"JavaTpoint
		// Official_v1.0_apkpure.com.apk");
		// driver=new AndroidDriver<MobileElement>(new
		// URL("http://127.0.0.1:4723/wd/hub"),cap);
		// cap.setCapability("appPackage", "com.sixt.webviewtest");
		// cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		cap.setCapability("appPackage", "com.sixt.webviewtest");
		cap.setCapability("appActivity", "com.sixt.webviewtest.MainActivity");
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		return driver;

	}
}
