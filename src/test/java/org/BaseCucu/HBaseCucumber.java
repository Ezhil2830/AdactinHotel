package org.BaseCucu;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
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
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.pojocucu.SearchHotelCucu;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HBaseCucumber {

	private static final String Break = null;
	public static WebDriver driver;
	//LAUNCH BROWSER:
	public static void launchBrowser() {
//		switch(Browsername) {
//		case "Chrome":
//			System.setProperty("webdriver.chrome.driver","C:\\Users\\ezhil\\eclipse-workspace\\MavenFirstDay1\\Driver\\chromedriver.exe");
//			driver=new ChromeDriver();
//			break;
//			
//		case "FireFox":
//			System.setProperty("webdriver.gecko.driver","C:\\Users\\ezhil\\eclipse-workspace\\MavenFirstDay1\\Driver\\geckodriver.exe");
//			driver=new FirefoxDriver();
//			break;
//		case "Ie":
//			System.setProperty("webdriver.ie.driver","C:\\Users\\ezhil\\eclipse-workspace\\MavenFirstDay1\\Driver\\IEDriverServer.exe");
//			driver=new InternetExplorerDriver();
//			break;}
//		}
	
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();}
	
	//LAUNCH URL:
		public static void launchurl (String Url) {
			driver.get(Url);}
		
		public static void maximizeWindow() {
			driver.manage().window().maximize();

		}
		
		//implicit method:
		public static void applyWaitToAllLocators() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		//SENDKEYS:
		
		public static void filltextbox(WebElement e,String value) {
			e.sendKeys(value);}
		//CLICK:
		
		public static void btnclick(WebElement e) {
			e.click();}
		//GET URL:
		
		public static String geturl() {
			String Url=driver.getCurrentUrl();
			return Url;}
		//GET TEXT:
		
		public static String getText(WebElement e) {
			return e.getText();}
		//GET ATTRIBUTE:
		
		public static String getAttribute(WebElement e) {
			return e.getAttribute("value");}
		//MOVE TO ELEMENT:
		
		public static void moveToElement(WebElement target) {
			Actions a =new Actions(driver);
			a.moveToElement(target).perform();}
		//Action CLICK:
		
		public static void actionclk(WebElement e) {
			Actions a =new Actions(driver);
			a.click(e).perform();
		}
		//DRAG AND DROP:
		
		public static void draganddrop(WebElement source,WebElement target) {
			Actions a =new Actions(driver);
			a.dragAndDrop(source,target).perform();}
		//CLICK AND HOLD:
		
		public static void ClickandHold(WebElement source,WebElement target) {
			Actions a =new Actions(driver);
			a.clickAndHold(source).release(target).perform();
		}
		
		
		//Assertion::
		
		public static void urlAssertionForvalidLogin() {
			String url=driver.getCurrentUrl();
			Assert.assertTrue("check the url", url.contains("SearchHotel"));	
		}
		
		public static void urlAssertionForvalidselect() {
			String url=driver.getCurrentUrl();
			Assert.assertTrue("check the url", url.contains("SelectHotel"));	
		}
		
		public static void assertionForInvalidLogin(WebElement element) {
			Assert.assertTrue("check the data", element.isDisplayed());	
		}
		//SELECT BY INDEX:
		
		public static void selectbyIndex(WebElement e,int index) {
			Select s=new Select(e);
			s.selectByIndex(index);}
		
		//SELECT BY TEXT:
		
		public static void selectbytext(WebElement e,String value) {
			Select s=new Select(e);
			s.selectByVisibleText(value);}
		
		
		
		
		
		//GET CURRENT URL;
		
		public static String getcurrenturl() {
			String url=driver.getCurrentUrl();
			return url;
		}
		
		//GET CURRENT TITLE:
		public static String getTitle() {
			String title=driver.getCurrentUrl();
			return title;}
		
		//Quit Browser:
		
		public static void quitBrowser() {
			driver.quit();}
		
		//CLOSE BROWSER:
		
		public static void closeBrowser() {
			driver.close();}
		
		//FIND ELEMENT::
		
		public static WebElement findElementById(String id) {
			return driver.findElement(By.id(id));
		}
		public static WebElement findElementByName(String name) {
			return driver.findElement(By.name(name));
		}
		public static WebElement findElementByXpath(String xpath) {
			return driver.findElement(By.xpath(xpath));
		}
		public static WebElement findElementByClassname(String classname) {
			return driver.findElement(By.className(classname));
		}
		
		//CONTEXT CLICK:
		
		public static void contextClick(WebElement target) {
			Actions a =new Actions(driver);
			a.contextClick(target).perform();}
		//DOUBLE CLICK:
		
		public static void doubleClick(WebElement target) {
			Actions a =new Actions(driver);
			a.doubleClick(target).perform();}
		
		//ALERT::
		
		public static void acceptAlert() {
			Alert sa= driver.switchTo().alert();
			sa.accept();}
		public static void dismissAlert() {
			Alert ca=driver.switchTo().alert();
			ca.dismiss();}
		public static void textAlert(String text) {
			Alert pa=driver.switchTo().alert();
			pa.sendKeys(text);
			pa.accept();}
		
		//Select By Value:
		
		public static void selectByValue(WebElement e,String value) {
			Select s=new Select(e);
			s.selectByValue(value);}
		
		//Deselect by Index:
		public static void deselectByIndex(WebElement e,int index) {
			Select s=new Select(e);
			s.deselectByIndex(index);}
		
		//Deselect by value:
		
		public static void deselectByValue(WebElement e,String Value) {
			Select s=new Select(e);
			s.deselectByValue(Value);}
		//Deselect by visible text:
		
		public static void deselectByText(WebElement e,String value) {
			Select s=new Select(e);
			s.deselectByVisibleText(value);}
		
		//Get All Options:
		public static void getAllOption(WebElement e) {
			Select s=new Select(e);
			List<WebElement> op=s.getOptions();
			for(WebElement eachoption:op) {
				String text=eachoption.getText();
				System.out.println(text);}}
			
			//Get All Selected options
			
			 public static void getAllSelectedOption(WebElement e){
				Select s=new Select(e);
				List<WebElement> allselect=s.getAllSelectedOptions();
				for(WebElement as:allselect) {
					String text=as.getText();
					System.out.println(text);}}
			//	IsMultiple:
			 
			 public static boolean isMultiple(WebElement e) {
				 Select s=new Select(e);
				 return s.isMultiple();}
			 
			 //First selected option:
			 
			 public static String firstSelectedOption(WebElement e) {
				 Select s=new Select(e);
				 WebElement first =s.getFirstSelectedOption();
				 return first.getText();}
			 
			 //isDisplayed::
			 
			 public static boolean isDisplayed(WebElement e) {
				 return e.isDisplayed();}
			 
			 //IsEnabled::
			 
			 public static boolean isEnabled(WebElement e) {
				 return e.isEnabled();}
			 
			 //Is Selected::
			 public static boolean isselected(WebElement e) {
				 return e.isSelected();}

			 
			 
			 //TAKE SCREENSHOT::
			 
			 public static void takescreenshot() throws IOException{
				 TakesScreenshot ts=(TakesScreenshot)driver;
				 File src=ts.getScreenshotAs(OutputType.FILE);
				 long time=System.currentTimeMillis();
				 File des=new File("\"C:\\Users\\ezhil\\eclipse-workspace\\Selenium\\src\\Screenshotss\\greenscore"+time +".png");
				 FileUtils.copyFile(src,des);}
			 
			 public static void takeSnap(String filename)throws IOException{
				 TakesScreenshot ss=(TakesScreenshot)driver;
				 File src=ss.getScreenshotAs(OutputType.FILE);
				 File dest= new File("src\\test\\resources\\Reports\\Screenshot" +filename+ ".png");
				 FileUtils.copyFile(src, dest);
			 }
			 
			 //JavaScriptExecutor
			 //ScrollDown
			 
			 public static void scrolldown(WebElement e) {
				 JavascriptExecutor js=(JavascriptExecutor)driver;
				 js.executeScript("arguments[0].scrollIntoView(true)", e);
				 }
			 
			 //Scroll up::
			 
			 public static void scrollup(WebElement e) {
				 JavascriptExecutor js=(JavascriptExecutor)driver;
				 js.executeScript("arguments[0].scrollIntoView(false)", e);
				 }
			 
			 //JS with Send keys::
			 public static void jssendKeys(WebElement e,String data) {
				 JavascriptExecutor js= (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].setAttribute('value'," + data+ " ')",e);
			 }
						 
			 //Get text by javascript:
			 
			 public static String gettextbyJSE(WebElement e) {
				 JavascriptExecutor js=(JavascriptExecutor)driver;
				 Object obj=js.executeScript("return arguments[0].innerText", e);
				 String s=(String)obj;
				 return s;}
			 
			 
			 //Get Attribute By javascript::
			 
			 public static String getattributebyJSE(WebElement e) {
				 JavascriptExecutor js=(JavascriptExecutor)driver;
				 Object obj=js.executeScript("return arguments[0].getAttribute('value')", e);
				 String s=(String)obj;
				 return s;}
			 
			 //insert values or sendkeys using JSE:
			 
			 public static void fillupbyJSE(WebElement e,String val) {
				 JavascriptExecutor js=(JavascriptExecutor)driver; 
				 js.executeScript(val, e);}
			 
			 //Button click by JSE:
			 
			 public static void btnclickbyJSE(WebElement e) {
				 JavascriptExecutor js=(JavascriptExecutor)driver; 
				 js.executeScript("arguments[0].click()", e);}
			 
			 //Windows Handling:
			 
			 public static void swtichWindow(int index) {
				 String pId=driver.getWindowHandle();
				 Set<String> allId=driver.getWindowHandles();
				 List<String> li=new LinkedList<>();
				 li.addAll(allId);
				 String id=li.get(index);
				 driver.switchTo().window(id);}
			 
			 //FRAMES::
			 
			 public static void FramesByIndex(int i) {
				 driver.switchTo().frame(i);
			 }
			 public static void FramesByString(String name) {
				 driver.switchTo().frame(name);}
			 public static void FramesByWebElement(WebElement e) {
				 driver.switchTo().frame(e);}

				 //DataDriven ---Excel data:
			 public static String getData(String Sheetname,int rowno,int cellno) throws IOException {
				 File loc=new File("C:\\\\Users\\\\ezhil\\\\eclipse-workspace\\\\MavenFirstDay1\\\\src\\\\test\\\\resources\\\\Excel\\\\FrameData.xlsx");
					FileInputStream st= new FileInputStream(loc);
					Workbook w=new XSSFWorkbook(st);
					Sheet sh=w.getSheet("FrameData");
					Row row=sh.getRow(rowno);
				    Cell cell=row.getCell(cellno);
				    int type=cell.getCellType();
				    String value=null;
				    if(type==1) {
				    	value=cell.getStringCellValue();
				    }
				    else {
				    	if(DateUtil.isCellDateFormatted(cell)) {
				    		value=new SimpleDateFormat("dd-MMM-yyyy").format(cell.getDateCellValue());
				    	}
				    	else {
				    		double db=cell.getNumericCellValue();
							long ln=(long)db;
				    		value=String.valueOf(ln);
				    	}
				    	}
				    return value;
				    }
			 public static void main(String[]args) throws IOException {
				String data=getData("FrameData",1,1);
				System.out.println(data);
			 }
					
			 }



	
	

