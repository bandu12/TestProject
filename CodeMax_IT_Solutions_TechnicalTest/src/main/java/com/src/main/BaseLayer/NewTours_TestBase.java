package com.src.main.BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTours_TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static com.src.main.CommonUtilLayer.WebEventListener eventListener;

	public NewTours_TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\workspace\\CodeMax_IT_Solutions_TechnicalTest\\src\\main\\java\\com\\src\\"
					+ "main\\Configuration\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	

	public static void intialization() throws InterruptedException {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		e_driver = new EventFiringWebDriver(driver);
		// now create object of EventListnerHandler to register it with
		// EventFiringWebDriver
		eventListener = new com.src.main.CommonUtilLayer.WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut,
		// TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(com.src.main.CommonUtilLayer.TestUtil.Implicit_Wait,
				TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(com.src.main.CommonUtilLayer.TestUtil.Page_Load_TimeOut,
				TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
	}
}
