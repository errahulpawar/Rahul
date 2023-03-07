package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hrms.utility.log;

	public class General extends Global {

		//*********** To provide re-usable fun:/methods related to whole application
		
		WebDriver driver;
		
		public void openApplication() {
			
			System.setProperty("WebDriver.gecko.driver", "F:\\Drivers\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			
			driver.navigate().to(url);
			
			System.out.println("Application Opened");//console
			
			Reporter.log("Application opened");//html reports
			
			log.info("Application opened");// logfile
			
		}
		
		public void closeApplication() {
			
			driver.close();
			
			System.out.println("Close Application");
			
			log.info("Close application");
			
		}
		
		public void login() {
			
			driver.findElement(By.name(txt_loginname)).sendKeys(un);
			
			driver.findElement(By.name(txt_password)).sendKeys(pw);
			
			driver.findElement(By.name(btn_login)).click();
			
			System.out.println("Login Completed");
			
			log.info("Login completed");
			
			
		}
		
		public void EnterintoFrame() {
			
			driver.switchTo().frame("rightMenu");
			
			System.out.println("Entered into frame");
			
			log.info("Enter into frame");
		}
		
		
		public void ExittoFrame(){
			
			driver.switchTo().defaultContent();
			
			System.out.println("Exit from frame");
			
			log.info("Exit from frame");
			
		}
		
		 public void AddEmp () {
			
		        driver.findElement(By.xpath(btn_Add)).click();
			
		        driver.findElement(By.name(txt_firstname)).sendKeys(fn);
			
			    driver.findElement(By.name(txt_lastname)).sendKeys(ln);
			
			    driver.findElement(By.id(btn_save)).click();
			
			    System.out.println("Add Employee");
			    
			    log.info("Add employee");
		
			
		 }
		public void EditInfo () {
			
			
			driver.findElement(By.xpath(link)).click();
			
			driver.findElement(By.name(btn_edit)).click();
			
			driver.findElement(By.name(EmpF_N)).clear();
			
			driver.findElement(By.name(EmpL_N)).clear();
			
		    driver.findElement(By.name(EmpF_N)).sendKeys(EmplFN);
			
			driver.findElement(By.name(EmpL_N)).sendKeys(EmplLN);
			
			driver.findElement(By.name(bttn_Save)).click();
			
			
		}
		public void DeleteId() {
		
			
			Select st = new Select (driver.findElement(By.id(EmpID)));
			
			st.selectByIndex(1);
			
			driver.findElement(By.name(Searchbox)).sendKeys(Empid);
			
			driver.findElement(By.xpath(Search_btn)).click();
			
			driver.findElement(By.name(Checkbox)).click();
			
			driver.findElement(By.xpath(Delete_btn)).click();
			
			System.out.println("Delete successfully");
			
			log.info("Delete successfully");
				
		}
		
		public void logout() {
			
			driver.findElement(By.linkText(link_logout)).click();
			
			System.out.println("Logout Completed");
			
			log.info("Logout Completed");
			
		}
	}


