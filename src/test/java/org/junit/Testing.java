package org.junit;



import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing extends BaseClass {

	
	@BeforeClass
	public static void Beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		}
	
	
	
	@Before
	public void before() {
		Date d1=new Date();
		System.out.println(d1);
		}
	
	
	
	@Test
	public void test1() throws IOException {
		LoginPage l=new LoginPage();
		enterText(l.getTxtUsername(), getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx", "Sheet1", 0,1 ));
	
		enterText(l.getTxtPassword(), getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx", "Sheet1", 1, 1));
	
		btnLogin(l.getBtnLogin());
		}
	
	
	@Test
	public void test2() throws IOException {
		SelectPage s=new SelectPage();
		  
		  selectTextDropDown(s.getLocation(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx", "Sheet2", 0,1));
					
		 selectTextDropDown(s.getHotel(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx", "Sheet2", 1,1));
			
		  selectTextDropDown(s.getRoomtype(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx", "Sheet2", 2,1));
					
		  selectTextDropDown(s.getNumofrooms(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx", "Sheet2", 3,1));
						
//		 
//		  indate.clear(s.getIndate);
//		  indate.sendKeys(getExcelData("C:\Users\muthu\eclipse-workspace\JunitFrame\TestData\JunitAdactin.xlsx", "Sheet2",4 ,1 ));
//		  
//		  
//		  outdate.clear(s.getIndate);
//		  outdate.sendKeys(getExcelData("C:\Users\muthu\eclipse-workspace\JunitFrame\TestData\JunitAdactin.xlsx", "Sheet2",5 ,1 ));
		  
		  
		  selectTextDropDown(s.getAdultroom(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx", "Sheet2", 6,1));
						
		  selectTextDropDown(s.getChildroom(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx", "Sheet2", 7,1));
						
		
		btnLogin(s.getBtnsubmit());
		}
	
	
	@Test
	public void test3() {
		RadioButton r=new RadioButton();
		
	btnLogin(r.getRadiobtn());
		btnLogin(r.getBtncontinue());
		}
	
	
	@Test
	public void test4() throws IOException, InterruptedException {
		AddressPage a=new AddressPage();
		
		enterText(a.getFirstname(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx", "Sheet3", 0, 1));
		
	
		enterText(a.getLastname(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx", "Sheet3", 1, 1));
	
		enterText(a.getAddress(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx","Sheet3", 2, 1));
		
	
		enterText(a.getCardnum(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx","Sheet3", 3, 1));

		
		selectTextDropDown(a.getCardtype(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx","Sheet3", 4, 1));
			
		selectTextDropDown(a.getMonth(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx","Sheet3", 5, 1));
		
		selectTextDropDown(a.getYear(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx","Sheet3", 6, 1));
		
		
		enterText(a.getCvvnum(),getExcelData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx","Sheet3", 7, 1));
		
		
		btnLogin(a.getBooknow());
		Thread.sleep(5000);
		
	}
	
	
	@Test
	public void test5() throws IOException {
		 OrderId o=new OrderId();
	      String attribute = o.getOrderno().getAttribute("value");
	      System.out.println(attribute);
	        addData("C:\\Users\\muthu\\eclipse-workspace\\JunitFrame\\TestData\\JunitAdactin.xlsx", "Sheet4", 1,1,attribute);
	  
		
	}




	@After
	public void after() {
		Date d=new Date();
		System.out.println(d);
		}
	
	
	
	@AfterClass
	public static void afterclass() {
		driver.quit();
	}
	

}
