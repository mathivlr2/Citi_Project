package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	// browser launch
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\Citi_Project\\Citi_Project\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();	
		driver.manage().window().maximize();
	}
	
	// URL
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	//sendKeys
	public static void sendData(WebElement element , String data) {
		element.sendKeys(data);
	}
	
	// click
	public static void clickdata(WebElement element ) {
		element.click();
	}
	
	public static String excelTestData(int rowdata, int celldata) {
		File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\Citi_Project"
				+ "\\src\\test\\resources\\TestData\\TestData_July.xlsx");
		String value = null;
		try {
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(rowdata);
			Cell cell = row.getCell(celldata);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
				System.out.println(value);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					// System.out.println(dateCellValue);
					SimpleDateFormat sc = new SimpleDateFormat("dd-MMM-yyyy");
					value = sc.format(dateCellValue);
					System.out.println(value);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long a = (long) numericCellValue;
					value = String.valueOf(a);
					System.out.println(value);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	public static void selectData(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public static WebElement findElementId(String id) {
		return driver.findElement(By.id(id));	
	}
	
	public static WebElement findElemenname(String id) {
		return driver.findElement(By.name(id));	
	}
	
	public static WebElement findElemenxpath(String id) {
		return driver.findElement(By.xpath(id));	
	}
	
	// Abstract Method
	public static WebElement findElementAbs(By by) {
		return driver.findElement(by);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
