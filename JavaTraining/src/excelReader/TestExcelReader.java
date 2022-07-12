package excelReader;

import java.util.Iterator;

public class TestExcelReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\JavaTraining\\DataSource\\Data1.xlsx";
		ExcelReaderMethod obj=new ExcelReaderMethod(path);
		int rowCount=obj.getRowCount(0);
		for (int i = 0; i < rowCount; i++) {
			System.out.println("UserName is......");
			System.out.println(obj.getData(0, i, 0));
			System.out.println("Password is......");
			System.out.println(obj.getData(0, i,1));
		}
		

	}

}
