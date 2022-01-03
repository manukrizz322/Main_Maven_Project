package com.Data;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public  void writedata() throws IOException {

		File fi = new File("C:\\Users\\Manojkrishnan\\OneDrive\\Desktop\\My Documents\\Data.xlsx");
		FileInputStream fis = new FileInputStream(fi);
		Workbook w = new XSSFWorkbook(fis);
		w.createSheet("sheet3").createRow(0).createCell(0).setCellValue("NAME");
		w.getSheet("sheet3").getRow(0).createCell(1).setCellValue("PASSWORD");
		w.getSheet("sheet3").createRow(1).createCell(0).setCellValue("Dinesh");
		w.getSheet("sheet3").getRow(1).createCell(1).setCellValue(3456);
		w.getSheet("sheet3").createRow(2).createCell(0).setCellValue("Suresh");
		w.getSheet("sheet3").getRow(2).createCell(1).setCellValue("suresh233@896");

		FileOutputStream fos = new FileOutputStream(fi);
		w.write(fos);
		w.close();

		System.out.println("read sucessfully");
	}

	public static void main(String[] args) throws IOException {
	new Write_Data().writedata();
	
	}
}
