package ReadingPropertiesFile;

import java.util.*;

import javax.naming.ConfigurationException;

import java.io.*;  
public class TestReadPropetries 
{  
	 public static void main(String[] args) {

	        try (OutputStream output = new FileOutputStream("/home/titik/Documents/project/JavaQA/BelajarJava/resource/file.properties")) {

	            Properties prop = new Properties();

	            // set the properties value
	            prop.setProperty("db.url", "localhost");
	            prop.setProperty("db.user", "mkyong");
	            prop.setProperty("db.password", "password");

	            // save properties to project root folder
	            prop.store(output, null);

	            System.out.println(prop);

	        } catch (IOException io) {
	            io.printStackTrace();
	        }

	    }
}  