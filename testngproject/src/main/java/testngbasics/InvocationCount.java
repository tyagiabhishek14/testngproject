package testngbasics;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 10)
	public void sum() {
		int a = 10+20;
		System.out.println(a);
	}

}
