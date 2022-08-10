package genericUtilities;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(genericUtilities.DemoForITestListner.class)
public class DemoTestCase {
	@Test
	public void demo() {
		Reporter.log("test case passed");
		assertEquals(false, true);
	}
	@Test
	public void disp() {
		Reporter.log("hsdfhfsdhfd");
	}
	}

