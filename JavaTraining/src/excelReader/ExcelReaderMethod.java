package excelReader;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderMethod {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public ExcelReaderMethod(String filepath) {
		// TODO Auto-generated constructor stub
		FileInputStream fis;
		try {
			fis=new FileInputStream(filepath);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
		public String getData(int sheetnumber,int row, int cell) {
			sheet =workbook.getSheetAt(sheetnumber);
			String data=sheet.getRow(row).getCell(cell).getStringCellValue();
			
			return data;
		}
		public int getRowCount(int sheetindex)
		{
			int rowCount = workbook.getSheetAt(sheetindex).getLastRowNum();
			rowCount = rowCount + 1;
			System.out.println("Total no of row are..."+rowCount);
			return rowCount;
		}
		
	

}
