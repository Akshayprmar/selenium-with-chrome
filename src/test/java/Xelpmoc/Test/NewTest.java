package Xelpmoc.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import bsh.Console;

public class NewTest {
  @Test
  public void Login() throws InterruptedException {
	  
	 
	  System.setProperty("webdriver.chrome.driver","chromedriver");
	  ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--allow-insecure-localhost");

      WebDriver driver = new ChromeDriver(chromeOptions);
	  driver.get("https://www.google.com");
	  System.out.println("Atty build is success");
	  Thread.sleep(2000);
	  assertEquals("Google", driver.getTitle());
  }
}
