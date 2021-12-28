package Jenkins.DemoJob;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void testngreport() {
	  test testng=new test();
	  int result=testng.add(100, 750)+testng.mul(20, 75);
  }
}
