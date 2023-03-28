package org.one;

import org.testng.annotations.Test;

public class Expected_Exception {
	@Test(expectedExceptions=Throwable.class)
	 private void practice() {
		 String s=null;
		 System.out.println(s.length());
		 System.out.println("pass");
	}
}
