package selflearn;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//String S = driver.findElementByXPath("//tbody/tr[7]/td[1]/a").getText();
		driver.findElementByXPath("//strong['nbsp']").click();
		String F = "//tbody/tr[";
		String L = "]/td[1]/a";
		for(int i=1;i<50;i++)
		{
			String S = driver.findElementByXPath(F +i+L).getText();
			System.out.println(S);
			if(S.contains("Spicejet Ltd."))
			{
				driver.findElementByXPath(F +i+L).click();
			}
		}
		
		
		

	}

}
