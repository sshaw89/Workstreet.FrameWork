package com.guru99.genericlibrary;

import java.io.FileReader;
import java.util.Properties;

public class FileUtis {
	public Properties getPropertyObject() throws Throwable {
		FileReader flib=new FileReader(".//Data//commonfiles.properties");
		Properties propertyobj=new Properties();
		propertyobj.load(flib);
		String url=propertyobj.getProperty("url");
		String username=propertyobj.getProperty("username");
		String password=propertyobj.getProperty("password");
		String invalidusername=propertyobj.getProperty("invalidusername");
		String invalidpassword=propertyobj.getProperty("invalidpassword");
		return propertyobj;
	
	}
}
