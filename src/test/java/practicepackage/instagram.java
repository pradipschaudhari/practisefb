package practicepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class instagram {
  @Test
  public void insta() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.instagram.com/");
	  driver.manage().window().maximize();
	  Reporter.log("lauching the instagram.....",true);
  }
}
