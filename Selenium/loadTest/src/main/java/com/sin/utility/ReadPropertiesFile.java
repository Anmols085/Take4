package com.sin.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static Properties setProperties() throws Exception{
		Properties properties = new Properties();
		try(FileInputStream fileInput = new FileInputStream(new File("test.properties"))) {
			//File file = new File("test.properties");
			//FileInputStream fileInput = new FileInputStream(file);
			properties.load(fileInput);
			//fileInput.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
		return properties;
	}
}
