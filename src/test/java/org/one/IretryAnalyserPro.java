package org.one;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class IretryAnalyserPro {
	@Test
	public void practice() {
		String a="AAA";
		String b="AAA";
		SoftAssert s=new SoftAssert();
		s.assertEquals(a,b);
	}
}
