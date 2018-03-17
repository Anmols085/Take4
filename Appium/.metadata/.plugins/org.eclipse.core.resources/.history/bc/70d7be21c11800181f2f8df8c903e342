package amazon;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("rawtypes")
public class StartApplication {

	private static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),
				DesiredCompatibilityBuilder.getCapability("Amazon"));
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.quit();

	}

}
