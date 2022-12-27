package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSample {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\ECLIPS\\Maven\\Excel\\Sudhar.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Sheet1");
		
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				
				Cell c = r.getCell(j);
				
				int cellType = c.getCellType();
				
				String Value;
				
				if (cellType==1) {
					
					Value = c.getStringCellValue();
					
				}
				
				else if (DateUtil.isCellDateFormatted(c)) {
					
					Date d = c.getDateCellValue();
					
					SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyyy");
					
					Value = sim.format(d);
					
				}
				
				else {
					
					double n = c.getNumericCellValue();
					
					long l = (long) n;
					
					Value = String.valueOf(l);
					
				}
				
				System.out.println(Value);
				
			}
			
		}
			
		}
		
	


}
