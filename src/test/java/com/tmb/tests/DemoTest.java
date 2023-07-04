package com.tmb.tests;

import org.testng.annotations.Test;
import com.tmb.config.ConfigFactory;

public class DemoTest {

	@Test
	public void testLogin() {

		//FrameworkConfig config = ConfigCache.getOrCreate(FrameworkConfig.class);
		System.out.println(ConfigFactory.getConfig().browser());

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.quit();

	}

}
