package selflearn;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver_win32//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.tnstc.in/");
		driver.manage().window().maximize();
		List<WebElement> linklist = driver.findElementsByTagName("a");
		//linklist.addAll(driver.findElementsByTagName("img"));
		System.out.println("TotalLinklist : " +linklist.size());
		
		
		List<WebElement> activelinks = new ArrayList<WebElement>();
		for(int i=0;i<linklist.size();i++)
		{
			
			System.out.println(linklist.get(i).getAttribute("href"));
			if(linklist.get(i).getAttribute("href")!=null && (!linklist.get(i).getAttribute("href").contains("javascript")))
		
			{
				activelinks.add(linklist.get(i));
			}
		}
		
		System.out.println("ActiveLinklist : " +activelinks.size());
		for(int j=0;j<activelinks.size();j++)
		{
			HttpURLConnection conn=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			conn.connect();
			String message=conn.getResponseMessage();
			conn.disconnect();
		
			
			
			if(!"OK".equals(message))
			{
				System.out.println(activelinks.get(j).getAttribute("href")+"   Response message "+message);
			}
//			else
//			{
//				System.out.println(activelinks.get(j).getAttribute("href")+"   Error message "+message);
//			}
			
		}
		
		
		

	}

}