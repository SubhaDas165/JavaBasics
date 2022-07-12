package excelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\JavaTraining\\DataSource\\Data1.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int rowcount=workbook.getSheetAt(0).getLastRowNum();
		System.out.println(rowcount);
		
		
		String data=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);

	}

}
