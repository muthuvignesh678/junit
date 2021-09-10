package org.junit;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 static WebDriver driver;
	 static Actions actions;
	 static Alert alert;
	 static TakesScreenshot screenshot;
	 static JavascriptExecutor executor;
	 static Select select;
	 


//Browser Name	
	 public static void getDriver(String browserName) {
			if (browserName.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			}
   

	 
	 
	 //Launch url
public static void launchUrl(String url) {
	driver.get(url);
	}




//Input text
public static void enterText(WebElement element,String text) {
	element.sendKeys(text);
}





//Button Click
public static void btnLogin(WebElement element) {
	element.click();
	}



//Maximize
public static void maximize() {
	driver.manage().window().maximize();
}


//Drop and down index
public static void selectIndexDropDown(WebElement element,int index){
	Select select=new Select(element);
    select.selectByIndex(index);
	}


//Drop and down value
public static void selectValueDropDown(WebElement element,String value){
	Select select1=new Select(element);
  select1.selectByValue(value);
	}

//Drop and down Text
public static void selectTextDropDown(WebElement element,String text){
	Select select2=new Select(element);
    select2.selectByVisibleText(text);
	}



//Close Browser
public static void closeBrowser() {
	driver.quit();
}



//Close Current Browser
public static void closeCurrentBrowser() {
	driver.close();
	}



//Print the Text
public static String printText(WebElement element) {
	String text=element.getText();
	return text;
}



//print Attribute
public static String toGetAttribute(WebElement element,String value) {
String attribute = element.getAttribute(value);
return attribute;
}




//Print Title
public static String printTitle() {
	String title = driver.getTitle();
	return title;
	}





//Print CurrentUrl
public static String printCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
}



//Navigate To
public static void navigateTo(String data) {
	driver.navigate().to(data);
}





// Navigate Refresh
public static void refresh() {
	driver.navigate().refresh();
}




//Navigate Back
public static void navigateBack() {
	driver.navigate().back();
}



//Navigate Forward
public static void forward() {
	driver.navigate().forward();
	}




//Actions
public static Actions actions() {
	 actions = new Actions(driver);
	return actions;
}


//Drag and Drop
public static void dragAndDrop(WebElement s,WebElement d) {
	actions.dragAndDrop(s,d).perform();
}



//Right Click
public static void rightClick() {
	actions.contextClick();
}



//Double Click
public static void doubleClick() {
	actions.doubleClick();
}



//Alert 
public static Alert alertWindows() {
	alert=driver.switchTo().alert();
 return alert;
}



//Alert Accept
public static void accept() {
	alert.accept();
}



//Alert Dismiss
public static void dismiss() {
	alert.dismiss();
}


//Print Text In Alert
public static String printTextInAlert() {
	String text = alert.getText();
	return text;
}



//Type in Alert
public static void typeInAlert(String data) {
	   alert.sendKeys(data);
	}




//Take Screenshot
public static TakesScreenshot screenShot() {
	screenshot=(TakesScreenshot)driver;
	return screenshot;
}



//Save Screenshot
public static File saveScreenShotInDefaultLoc() {
	File S=screenshot.getScreenshotAs(OutputType.FILE);
	return S;
}



//File Creation
public static File fileCreation(String path) {
	File file=new File(path);
	return file;
}




//Save Screenshot inSpecified Location
public static void saveScreensshotInSpeceficLoc(File s,File d) throws IOException {
	FileUtils.copyFile(s, d);
}




//JavaScript Executor
public static JavascriptExecutor javaScript() {
	executor=(JavascriptExecutor)driver;
	return executor;
}


//ExecutorScript
public static void executeUsingJavaScript(String data,WebElement element)  {
	executor.executeScript(data, element);
}



//Get Attribute JavaScript
public static Object getAttributeJavaScript(String data,WebElement element) {
	Object executeScript=executor.executeScript(data, element);
	return executeScript;
}



//Scroll up And Down
public static void ScrollUpAndDown(String data,WebElement element) {
	executor.executeScript(data, element);
}


//Select
public static Select select(WebElement element) {
	Select select=new Select(element);
	return select;
}


//Select By Index
public static void selectionByIndex(WebElement element,int index) {
	Select s=new Select(element);
	s.selectByIndex(index);
}



//Select By Text
public static void selectionByText(WebElement element, String text) {
    Select s1=new Select(element);
	s1. selectByVisibleText(text);
}


//Select By Value
public static void selectionByValue(WebElement element,String value) {
	Select s2=new Select(element);
	s2.selectByValue(value);
}


//
////DeSelect By index
//public static void deselectByIndex(int i) {
//	select.deselectByIndex(i);
//}
//
//
//
//
////DeSelect By Text
//public static void deselectByText(String data) {
//	select.deselectByVisibleText(data);
//}
//
//
//
//
////DeSelect By Value
//public static void deselectByValue( String data) {
//	select.deselectByValue(data);
//}





//List of Get Options
public static List<WebElement> toGetOptionsFromDropDown(){
	List<WebElement> options=select.getOptions();
	return options;
	}




//First Selected Options
public static WebElement toGetFirstSelectedOption() {
	WebElement firstSelectedOptions=select.getFirstSelectedOption();
	return firstSelectedOptions;
}



//List Of ALL Selected Options
public static List<WebElement> toGetAllSelectedOptions(){
	List<WebElement> allSelectedoptions=select.getAllSelectedOptions();
	return allSelectedoptions;
	}



//DeSelect All
public static void toDeselectAll() {
	select.deselectAll();
}





//Switch to Frame Using Element
public static void switchToFrameUsingElement(WebElement element) {
	driver.switchTo().frame(element);
}



//Switch to Frame Using Name
public static void switchToFrameUsingIdAndName(String data) {
	driver.switchTo().frame(data);
}


//Switch to Frame Using Index
public static void switchToFrameUsingIndex(int i) {
	driver.switchTo().frame(i);
}



// Exit Frame
public static void exitFrame() {
	driver.switchTo().defaultContent();
}




//Exit Child Frame
public static void exitChildFrame() {
	driver.switchTo().parentFrame();
}



//Switch to windowUsing Url
public static void switchToWindowUsingUrl(String data) {
	driver.switchTo().window(data);
}



//Switch To Using Title
public static void switchToUsingTitle(String data) {
	driver.switchTo().window(data);
}




//Switch To Using Id
public static void switchToUsingId(String data) {
	driver.switchTo().window(data);
	}




//TO Get ParentWindow Id
public static String toGetParentWindowId() {
	String windowHandle = driver.getWindowHandle();
	return windowHandle;
}





//Set To Get All WindowsID
public static Set<String> toGetAllWindowsId() {
	Set<String> windowHandles = driver.getWindowHandles();
	return windowHandles;
}



//Implicit Wait
public static void implicitWait(int time) {
	
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}



//WebDriver Wait
public static WebDriverWait webDriverWait (int time) {
	WebDriverWait wait=new 	WebDriverWait(driver,time);
	return wait;
}





//Is Displayed
public static boolean isDisplayed(WebElement element) {
	boolean displayed = element.isDisplayed();
	return displayed;
	}




//Is Enabled
public static boolean isEnabled(WebElement element) {
	boolean enabled = element.isEnabled();
	return enabled;
}




//Is Selected
public static boolean isSelected(WebElement element) {
	boolean selected = element.isSelected();
	return selected;
	}



//Clear Text
public static void clearText(WebElement element) {
	element.clear();
}




//Get Data From Excel
public static String getExcelData(String path,String sheetname,int rownum,int cellnum) throws IOException{
	String data=null;
	File file=new File(path);
	FileInputStream stream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet(sheetname);
	Row row = sheet.getRow(rownum);
	Cell cell = row.getCell(cellnum);
	int type = cell.getCellType();
	if (type==1) {
		 data = cell.getStringCellValue();
		}
	if (type==0) {
		if (DateUtil.isCellDateFormatted(cell)) {
			
			Date date = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
			data = dateFormat.format(date);
		}
		else {
			double d = cell.getNumericCellValue();
			long l=(long)d;
			 data = String.valueOf(l);
			}
		}
	return data;
	}





//Create Data From Excel
public static void addData(String path,String sheetname,int r,int c,String data) throws IOException {
	File file=new File(path);
    Workbook workbook=new XSSFWorkbook();
    Sheet sheet = workbook.createSheet(sheetname);
    Row row = sheet.createRow(r);
    Cell cell = row.createCell(c);
    cell.setCellValue(data);
    FileOutputStream fileOutputStream = new FileOutputStream(file);
    workbook.write(fileOutputStream);
 }







//Locator Find

public static WebElement locators(String locator, String value) {
	WebElement element = null;
	if (locator.equalsIgnoreCase("id")) {
		element = driver.findElement(By.id(value));
	} else if (locator.equalsIgnoreCase("name")) {
		element = driver.findElement(By.name(value));
	} else if (locator.equalsIgnoreCase("xpath")) {
		element = driver.findElement(By.xpath(value));
	}
	return element;

}
}















































































































