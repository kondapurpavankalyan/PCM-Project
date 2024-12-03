package com.pcm.qa.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintfromExcel {
	
	
	public String Excelprint(int r,int c) throws IOException, Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\sravan.dacha\\eclipse-workspace\\ContextdataProject\\src\\main\\resources\\Book6.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		System.out.println(sheet.getRow(r).getCell(c));
		XSSFCell configId=sheet.getRow(r).getCell(c);
		return configId.getStringCellValue();

		}

}
