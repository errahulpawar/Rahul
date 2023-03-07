package com.hrms.testscripts;

import com.hrms.lib.General;

	public class TC003 {

		   public static void main (String args []) throws Exception {
				
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
