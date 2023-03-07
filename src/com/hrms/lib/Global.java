package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
			
			public WebDriver driver ; 

			// To provide test data & objects related to whole application
			
			//*********** TestData login logout
			
			public String url = "http://183.82.103.245/nareshit/login.php";
			public String un  = "nareshit";
			public String pw  = "nareshit";
			
			// Add Employee Test Data
			
			
			public String fn  = "Rahul";
			public String ln  = "Pawar";
			
			
			// Edit Employee Test Data 
			
		    public String EmplFN = "sachin";
		    public String EmplLN = "pawar";
		    
		    // Delete Emp Test Data 
		    
		    public String Empid   = "2278";
		   
			
			//*********** Objects/Element login logout
			
			public String txt_loginname = "txtUserName";
			public String txt_password  = "txtPassword";
			public String btn_login     = "Submit";
			
			
			// Add Employee Objects/Element
			
			
			  public String btn_Add       = "// input [@ value = 'Add'][@ type = 'button']";
			  public String txt_firstname = "txtEmpFirstName";
			  public String txt_lastname  = "txtEmpLastName";
			  public String btn_save      = "btnEdit";
			  public String link_logout   = "Logout";
			
			// Edit Employee Objects/Element 
			
			public String id            = "rightMenu";
			public String link          = "//*[@id=\"standardView\"]/table/tbody/tr[8]/td[3]/a";
			public String btn_edit      = "EditMain";
			public String EmpL_N        = "txtEmpLastName";
			public String EmpF_N        = "txtEmpFirstName";
			public String bttn_Save     = "EditMain";
			
			// Delete Employee Id Objects/Element 
			
			public String EmpID        = "loc_code";
			public String Searchbox     = "loc_name";
			public String Search_btn    = "//*[@id=\"standardView\"]/div[2]/input[2]";
			public String Checkbox      = "chkLocID[]";
			public String Delete_btn    = "//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";
			
		}

