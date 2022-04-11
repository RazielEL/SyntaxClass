package com.syntax.class029;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo5 {
    public static void main (String[] args) throws IOException {

        String path = "/home/razz/Documents/test02.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(path); // creation of new excel document
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        Sheet sheet = xssfWorkbook.createSheet("Sheet2");

        Row row = sheet.createRow(0);
        Row row1 = sheet.createRow(1);
        Row row2 = sheet.createRow(2);

        row.createCell(0).setCellValue("Adam");
        row.createCell(1).setCellValue("Erem");
        row2.createCell(2).setCellValue("Mikasa");
        row2.createCell(3).setCellValue("Armin");
        row2.createCell(4).setCellValue("Erwin");

        xssfWorkbook.write(fileOutputStream);






    }
}
