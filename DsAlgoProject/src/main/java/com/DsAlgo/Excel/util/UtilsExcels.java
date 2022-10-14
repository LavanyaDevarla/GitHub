package com.DsAlgo.Excel.util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilsExcels {
	
	
	
	static String projectpath;
	   static  XSSFWorkbook workbook;
	   static XSSFSheet sheet;
	   //constructor
	   public UtilsExcels(String excelpath,String sheetname ) {
	    try {
	    workbook = new XSSFWorkbook(excelpath);
	sheet=workbook.getSheet(sheetname);
	} catch (Exception e) {
	e.printStackTrace();
	}
	   
	   }
	public int getrowcount() {
	int rowcount=0;
	try {
	rowcount=sheet.getPhysicalNumberOfRows();
	System.out.println("No of rows "+rowcount);
	} catch (Exception exp) {
	System.out.println(exp.getMessage());
	System.out.println(exp.getCause());
	exp.printStackTrace();
	}
	return rowcount;

	}

	public int getcolcount() {
	int columncount=0;
	try {
	columncount=sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println("No of columns "+columncount);
	} catch (Exception exp) {
	System.out.println(exp.getMessage());
	System.out.println(exp.getCause());
	exp.printStackTrace();
	}
	return columncount;
	}
	         public static String getcelldataString(int rowNum,int colNum) {
	        String celldata=null;
	  try {
	    celldata=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	System.out.println(celldata);
	} catch (Exception exp) {
	System.out.println(exp.getMessage());
	System.out.println(exp.getCause());
	exp.printStackTrace();
	}
	  return celldata;
	       
	         }
	         public static void getcelldataNumber(int rowNum,int colNum) {
	       
	  try {
	  double celldata=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
	  System.out.println(celldata);
	  } catch (Exception exp) {
	  System.out.println(exp.getMessage());
	  System.out.println(exp.getCause());
	  exp.printStackTrace();
	  }
	 
	         
	          }
	}


