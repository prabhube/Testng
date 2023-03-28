package org.one;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTestNG {
	@Test
	private void practce() {
		//Verification
		String username="prabhu";
		String name="Prabhu";
		SoftAssert s=new SoftAssert();
		s.assertEquals(username,name);
	}
}
