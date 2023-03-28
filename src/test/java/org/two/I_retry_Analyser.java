package org.two;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class I_retry_Analyser {
@Test(retryAnalyzer=Runner.class)
	private void name() {
	String s="prabhu";
	String b="prem";
	Assert.assertEquals(s,b);
	System.out.println("hai all");
	
}
}
