package Genericlib;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertycutils {
	/**
	 * fetching data from file
	 * @return 
	 * @throws Throwable 
	 */

	public String filedatafetch(String path,String key) throws Throwable
	
	{
	FileInputStream fis = new FileInputStream(path);
	Properties pobj = new Properties();
	pobj.load(fis);
	return pobj.getProperty(key);
		
	}

}
