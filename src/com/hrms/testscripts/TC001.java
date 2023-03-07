package com.hrms.testscripts;

import com.hrms.lib.General;

	public class TC001 {

			public static void main (String args []) throws Exception {
				
				// Test Steps
				
				General obj = new General ();
				
				obj.openApplication();
				
				obj.login();
				
				Thread.sleep(3000);
				
				obj.logout();
				
				 System.out.println("logout completed");
				
				obj.closeApplication();
			}
		}

