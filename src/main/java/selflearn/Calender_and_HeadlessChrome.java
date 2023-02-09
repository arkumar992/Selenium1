package selflearn;




import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender_and_HeadlessChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//Below Four lines for Head less option
		
		/*ChromeOptions obj  = new  ChromeOptions();
		obj.addArguments("window-size=1400,800");
		obj.addArguments("headless");
		ChromeDriver driver = new ChromeDriver(obj);*/
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		//tbody/tr[2]/td[4]/a
		driver.findElementByXPath("//a/h5[text()='Calendar']").click();
		Thread.sleep(500);
		driver.findElementById("datepicker").click();
		String Date ="28/10/2018";
		String[] datevalue= Date.split("/");
		String Date1 = datevalue[0];
		//String Month = datevalue[1];
		//String Year = datevalue[2];
		System.out.println(Date1);
//		String one =driver.findElementByXPath("//tbody/tr[2]/td[1]/a").getText();
//		System.out.println(one);
		
		boolean flag = false;
		for (int row =1;row<=7;row++)
		{
			for(int col=1;col<=7;++col)
			{
				try 
				{
					String tadate = driver.findElementByXPath("//tbody/tr["+row+"]/td["+col+"]/a").getText();
					System.out.println(tadate);
					if(tadate.equals(Date1))
					{
						driver.findElementByXPath("//tbody/tr["+row+"]/td["+col+"]/a").click();
						flag =true;
						break;
					}
				}catch(NoSuchElementException e)
				{
					
				}
				
				
			}
			if (flag)
			{
				break;
			}
		}
		Thread.sleep(3000);
		
		WebElement data = driver.findElementByXPath("//input[@id='datepicker']");
		String pgdate =data.getAttribute("value");
		System.out.println(pgdate);
		
		

	}


}
