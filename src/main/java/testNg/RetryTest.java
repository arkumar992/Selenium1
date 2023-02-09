package testNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {

	
	int count =0;
	int retrylimt =2;
	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		if(count<retrylimt)
		{
			count++;
			return true;
		}
		
		return false;
	}
	
	

}
