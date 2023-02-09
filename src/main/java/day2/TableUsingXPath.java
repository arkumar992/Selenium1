package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class TableUsingXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		int size = driver.findElementsByXPath("//section[@class='innerblock']//div//table//tr").size();
		System.out.println(size);
		int size1 = driver.findElementsByXPath("//section[@class='innerblock']//div//table//tr//td").size();
		System.out.println(size1);
		String s=driver.findElementByXPath("//tr[@class='even']//td[2]").getText();
		System.out.println(s);
	}

}
