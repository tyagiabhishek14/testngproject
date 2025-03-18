package testngbasics;

import org.testng.annotations.Test;

public class ExceptionTimeOutConcept {
	
	@Test(invocationTimeOut = 3000)
	public void timeout() {
		int a =10;
		while(a==10) {
			System.out.println(a);
		}
	}
	

}
