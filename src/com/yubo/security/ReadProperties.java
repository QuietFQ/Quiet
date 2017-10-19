package com.yubo.security;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws Exception {
		
		File file = new File("config/privateKey.properties");
		System.out.println(file.length());
		
		Map<String, String> map = new HashMap<>();
		
		Properties properties = new Properties();
		InputStream inputStream = new FileInputStream(file);
		try {
			properties.load(inputStream);
			 Enumeration<?> en=properties.propertyNames();
		        while (en.hasMoreElements()) {
		            String key=(String) en.nextElement();
		            String property=properties.getProperty(key);
		            map.put(key, property);
		            System.out.println(key + ":"+property);
		        }
			//System.out.println(properties.get("card.private.key"));;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
