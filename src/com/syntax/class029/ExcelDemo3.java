package com.syntax.class029;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo3 {
    public static void main(String[] args) throws IOException {

        String path = "/home/razz/Documents/zraziklupa.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(path); // creation of new excel document
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        Sheet sheet = xssfWorkbook.createSheet("Sheet1");

        for (int i = 0; i < 10; i++) {
            Row row = sheet.createRow(i);
            for (int j = 0; j < 5; j++) {
                Cell cell = row.createCell(j);
                cell.setCellValue("Lukasz");
            }
        }
        xssfWorkbook.write(fileOutputStream);
    }
}