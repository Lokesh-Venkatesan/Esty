package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class DataDriven {public static void main(String[] args) throws IOException {
	
	
	File f = new File("C:\\Users\\Lokesh\\eclipse-workspace\\FrameWork\\Excel\\sampledatahockey.xlsx");
	
	// File Input Stream to read the file ///
	FileInputStream fis = new FileInputStream(f);
	
	//creating object to read .xslx file
	Workbook wb = new XSSFWorkbook(fis);
	
	Sheet particularSheet = wb.getSheet("PlayerData");
	
	for (int i = 0; i <particularSheet.getPhysicalNumberOfRows(); i++) {
		
		Row allRows = particularSheet.getRow(i);
		
		for (int j = 0; j < allRows.getPhysicalNumberOfCells(); j++) {
			
			Cell allCells = allRows.getCell(j);
			
			System.out.println(allCells);
			
		}
		
	}
	
	
//	Row particularRow = particularSheet.getRow(6);
//	
//	
//	Cell particularCell = particularRow.getCell(8);
//	
//	
//	System.out.println(particularCell);
//
//	
//	
	
}

}
