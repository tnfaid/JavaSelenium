package Properties_JAR_PoiApi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;


public class ReadProperties {
	public static void main(String args[]) throws IOException 
	{
		  // pastikan lokasi file.properties sesuai dengan yang ada di pc masing2
	      Properties prop = readPropertiesFile("/home/titik/Documents/project/JavaQA/BelajarJava/resource/file.properties");
	      System.out.println("username: "+ prop.getProperty("username"));
	      System.out.println("password: "+ prop.getProperty("password"));
	}
	public static Properties readPropertiesFile(String fileName) throws IOException 
	{
	      FileInputStream fis = null;
	      Properties prop = null;
	      try 
	      {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
	      } 
	      
	      catch(FileNotFoundException fnfe) 
	      {
	         fnfe.printStackTrace();
	      } 
	      
	      catch(IOException ioe) 
	      {
	         ioe.printStackTrace();
	      } 
	      
	      finally 
	      {
	         fis.close();
	      }
	      
	      return prop;
	}	   
	
}
