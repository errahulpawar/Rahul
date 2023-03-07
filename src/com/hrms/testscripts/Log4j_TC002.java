package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.lib.General;
		
	public class Log4j_TC002 {

			@Test 
			
			public void tc002() throws Exception {
				
				DOMConfigurator.configure("log4j.xml");
				
				General obj = new General();
				
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

