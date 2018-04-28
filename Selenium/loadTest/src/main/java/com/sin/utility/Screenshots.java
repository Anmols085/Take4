package com.sin.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshots extends BasePage{
	
	private static int count=0;
	public void switchToFrame() {
		//driver.switchTo().frame("mainpnel");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("src/main/resources/Screenshot"+count+".png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
