package com.training.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	FileInputStream fileinput; 
		public String getProperties(String key) {
			
			//1. path of the file to be read
			String userDir = System.getProperty("user.dir");
			String filesaperator = System.getProperty("file.separator");
			System.out.println(filesaperator);
			String filepath = userDir + filesaperator+"Properties"+filesaperator+"application.properties";
			
			//2.Load this filepath to file Object
			
			
			try {
				fileinput = new FileInputStream(filepath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			//3. Create the Object of Properties file
			Properties prop = new Properties();
			try {
				prop.load(fileinput);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			String value = prop.getProperty(key);
			return value;
			
			
		}
		
	}

