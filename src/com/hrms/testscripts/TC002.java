package com.hrms.testscripts;

import com.hrms.lib.General;
	
	public class TC002 {

		public static void main (String args []) throws Exception {
				
				// Test Steps
				
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




