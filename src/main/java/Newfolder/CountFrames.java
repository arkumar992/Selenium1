package Newfolder;

import org.openqa.selenium.chrome.ChromeDriver;

public class CountFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
int d= driver.findElementsByTagName("iframe").size();
System.out.println("Number of frames in the application:"+d);
driver.close();
	}

}
