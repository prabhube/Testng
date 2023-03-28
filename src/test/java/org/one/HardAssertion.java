package org.one;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	@Test
	private void practice() {
		String username="prabhu";
		String name="Prabhu";
		Assert.assertEquals(username, name);
	}
}
