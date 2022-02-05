// hierarchical inheritance
package org.stepdefinition;

import org.utility.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
@Before(order=1)
public void Before_scenario() {
	chromeBrowser();
	launchUrl("https://www.facebook.com/");
	mainwindow();
}
@Before(order=2)
public void Before_check() {
	System.out.println("Before check order 2 execute");
}
@Before(order=3)
public void Before_checking() {
	System.out.println("Before checking order 3 execute");
}

@After(order=3)
private void After_scenario() {
	driver.close();
}
@After(order=22)
private void After_check() {
	System.out.println("After check order 2 execute");
}
@After(order=1)
private void After_checking() {
	System.out.println("After checking order 3 execute");
}
}
