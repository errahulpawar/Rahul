package com.hrms.testscripts;
import org.testng.annotations.Test;
import com.hrms.lib.General;

	public class Testng_TC002 {

		@Test 
			
			public void tc002() throws Exception {
			
			General obj = new General ();
			
			obj.openApplication();
			
			obj.login();
			
			obj.EnterintoFrame();
			
			Thread.sleep(3000);
			
			obj.AddEmp();
			
			obj.ExittoFrame();
			
			Thread.sleep(3000);
			
			obj.logout();
			
			obj.closeApplication();
			
		}
}
