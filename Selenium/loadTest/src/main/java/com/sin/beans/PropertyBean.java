package com.sin.beans;

import java.util.Properties;

public class PropertyBean {

	static Properties properties = new Properties();

	public Properties getProperties() {
		return properties;
	}
	public static void setProperties(Properties property) {
		properties = property;
	}
	public String getProperty(String str) {
		return (String) properties.get(str);
	}
}
