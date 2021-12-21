package Listener_Study;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener_Study.Listener.class)
public class Test3 {
  
@Test
  public void TC2() {
	Reporter.log("TC2 is Running",true);
  }

@Test
public void TC1() {
	Reporter.log("TC1 is Running",true);
}
@Test
public void TC3() {
	Reporter.log("TC3 is Running",true);
}
@Test
public void TC4() {
	Reporter.log("TC4 is Running",true);
}
}
