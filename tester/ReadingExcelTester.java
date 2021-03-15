package com.xworkz.tester;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelTester {

	public static void main(String[] args) throws IOException {
		String filePath = ".\\Excel.xlsx";
		FileInputStream input = new FileInputStream(filePath);

		XSSFWorkbook workbook = new XSSFWorkbook(input);
//		XSSFSheet sheet = workbook.getSheet("CameraDetails");
		// or
		XSSFSheet sheet = workbook.getSheetAt(0);

		// using for loop

//		int rows = sheet.getLastRowNum();
//		int cols = sheet.getRow(1).getLastCellNum();
//
//		for (int r = 0; r <= rows; r++) {
//
//			XSSFRow row = sheet.getRow(r);
//
//			for (int c = 0; c < cols; c++) {
//
//				XSSFCell cell = row.getCell(c);
//				switch (cell.getCellType()) {
//				case STRING:
//					System.out.print(cell.getStringCellValue());
//					break;
//				case NUMERIC:
//					System.out.print(cell.getNumericCellValue());
//					break;
//
//				}
//				System.out.print("  ");
//			}
//			System.out.println();
//		}

		//using iterator
		
		Iterator iterator = sheet.iterator();
		
		while(iterator.hasNext()) {
			
			XSSFRow row = (XSSFRow) iterator.next();
			
			Iterator cellIterator = row.cellIterator();
			
			while(cellIterator.hasNext()) {
				
				XSSFCell  cell = (XSSFCell) cellIterator.next();
				
				switch (cell.getCellType()) {
				
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;

				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
