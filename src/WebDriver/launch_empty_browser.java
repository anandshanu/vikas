package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_empty_browser {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://upsc.gov.in/");
   String parent = driver.getWindowHandle();
   driver.findElement(By.xpath("//a[text()='One Time Registration (OTR) for Examinations']")).click();
  Set<String> child = driver.getWindowHandles();
  for(String id :child)
  {
	  driver.switchTo().window(id);
	  if(!id.equals(parent))
	  {
		 String ew = driver.getTitle();
		 System.out.println(ew);
	  }
  }
	}

}
