package com.hrms.testscripts;
import org.testng.annotations.Test;
import com.hrms.lib.General;

	public class Testng_TC003 {
		
		 @Test
			 
		     public void tc003 () throws Exception {
				 
		           // Test Steps

		                General obj = new General ();

		                obj.openApplication();

		                obj.login();

		                Thread.sleep(3000);

		                obj.EnterintoFrame();

		                Thread.sleep(3000);

		                obj.EditInfo();

		                Thread.sleep(3000);

		                obj.ExittoFrame();

		                Thread.sleep(3000);

		                obj.logout();

		                obj.closeApplication();
		}
}
