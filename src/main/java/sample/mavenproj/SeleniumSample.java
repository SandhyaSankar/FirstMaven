package sample.mavenproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {
	public void testSample() {
		/*Having lot of packages also a good practice
		Good practices of framework - anything that is there in double quotes should be part of 
		constants. Constants is a class, name all in caps
		this we are doing to make our code very well readable*/
		
		System.setProperty(Constants.BROWSER_DRIVER_PROP_KEY, Constants.BROWSER_DRIVER_PROP_VALUE);
		WebDriver driver = new ChromeDriver();
        driver.get(Constants.URL);
        String paragraph = driver.findElement(By.xpath(Locators.paragraphXpath)).getText();
        System.out.println(paragraph);
        		
	}
}
