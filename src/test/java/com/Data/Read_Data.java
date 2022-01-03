package com.Data;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Read_Data {
	Workbook w;
	public Read_Data() throws IOException {
		File fi = new File("./Data.xlsx");
		FileInputStream fis = new FileInputStream(fi);
		 w = new XSSFWorkbook(fis);
		
	}
public  void read_Particulardata() throws IOException {
       
		Cell cell = w.getSheetAt(0).getRow(1).getCell(0);
	
		CellType cellType = cell.getCellType();

		

		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);}

		 else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int num = (int) numericCellValue;

			System.out.println(num);

		}
    w.close();
	}

	public  void allData() throws IOException {

		

		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);

				} else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int num = (int) numericCellValue;

					System.out.println(num);

				}

			}

		}
		w.close();
	}

	public  void rowData() throws IOException {
		
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(3);

		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);

			} else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int num = (int) numericCellValue;
				System.out.println(num);

			}

		}
		w.close();
	}

	public  void columndata() throws IOException {

		
		

		Sheet sheetAt = w.getSheetAt(0);

		int numberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 1; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);

				} else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int num = (int) numericCellValue;

					System.out.println(num);

				}

			}
		}w.close();
	}
public static void main(String[] args) throws IOException {
	Read_Data r = new Read_Data();
	r.read_Particulardata();
	r.allData();
	r.columndata();
	r.columndata();
	
}
	

}
