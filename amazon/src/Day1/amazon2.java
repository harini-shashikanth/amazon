package Day1;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class amazon2 {
	WebDriver driver;
	@Test
	public void testapp() throws MalformedURLException, InterruptedException {
		//File app=new File("C://Users//shash//Desktop//mobileTesting practicecom.amazon.mShop.android.shopping.apk");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("deviceName", "LGH8302e18a304 ");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("platformPackage", "com.amazon.mShop.android.shopping");
		capabilities.setCapability("platformActivity", "com.amazon.mshop.HomeActivity");

		driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(8000);
		driver.quit();
		

}
}
