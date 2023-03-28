package org.one;

import org.testng.annotations.Test;

public class Depends_on_method {
@Test(enabled=false)	//if enabled =false then dependent methods will not execute
	public void rajaraman() {
System.out.println("father");
}
@Test(dependsOnMethods="rajaraman")  //this method will not executed
public void prem() {
System.out.println("brother");
}
@Test
private void prabhu() {			// this method also not execute
System.out.println("me");
}

}
