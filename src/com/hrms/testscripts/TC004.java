package com.hrms.testscripts;

import com.hrms.lib.General;

	public class TC004 {

			   public static void main (String args []) throws Exception {
					
					// Test Steps
					
					General obj = new General ();
					
					obj.openApplication();
					
					obj.login();
					
					Thread.sleep(3000);
					
					obj.EnterintoFrame();
					
					Thread.sleep(3000);
					
					obj.DeleteId();
					
					Thread.sleep(3000);
					
					obj.ExittoFrame();
					
					Thread.sleep(3000);
					
					obj.logout();
					
					Thread.sleep(3000);
					
					obj.closeApplication();
		}
}
