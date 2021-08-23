package com.actitime.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript 
{
	public static WebDriver driver;
	public static Properties prop;
	
	
   public DriverScript()
   {
	   try
	   {
		   File file = new File("./acticonfig/acticonfig.properties");
		   FileInputStream fis = new FileInputStream(file);
		   prop = new Properties();
		   prop.load(fis);
	   }
	   catch(Exception e)
	   {
		   System.out.println("Unable to read the value from properties file please check "+e.getMessage());
	   }
   }
	
	
   public static void initDriver()
   {
	    String browser = prop.getProperty("browser");
	    
	    if(browser.equalsIgnoreCase("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver", "./actibrowser/chromedriver.exe");
	    	driver=new ChromeDriver();
	    }
	    else if(browser.equalsIgnoreCase("firefox"))
	    {
	    	System.setProperty("webdriver.gecko.driver", "./actibrowser/geckodriver.exe");
	    	driver=new FirefoxDriver();
	    }
	    else if(browser.equalsIgnoreCase("edge"))
	    {
	    	System.setProperty("webdriver.edge.driver", "./actibrowser/msedgedriver.exe");
	    	driver=new EdgeDriver();
	    }
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    
	    String url = prop.getProperty("url");
	    driver.get(url);
	    
   }
   
   public static void quitDriver()
   {
	   driver.quit();
   }
	   
   
	

}
