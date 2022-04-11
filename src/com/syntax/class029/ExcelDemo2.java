package com.syntax.class029;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ExcelDemo2 {
    public static void main (String[] args) throws IOException {

        String path = "/home/razz/Documents/zrazik.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(path); // creation of new excel document
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        Sheet sheet = xssfWorkbook.createSheet("Sheet1");

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Lukasz Stanislawowski");
        xssfWorkbook.write(fileOutputStream); //to kopiuje dane z intellij to excela, tam zapisuje je.
        System.out.println(cell);





    }
}
