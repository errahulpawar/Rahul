package com.hrms.testscripts;
import org.testng.annotations.Test;
import com.hrms.lib.General;

	public class Testng_TC001 {

			@Test	

			   public void tc001() throws Exception {
				
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

