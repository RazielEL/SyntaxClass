package com.syntax.class028;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;

class ReadExcel {

    public static void main(String[] args) throws Exception {

        Workbook workbook = WorkbookFactory.create(new FileInputStream("/home/razz/Documents/test01.xlsx"));

        DataFormatter dataFormatter = new DataFormatter(new java.util.Locale("en", "US"));


        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            for (Cell cell : row) {
                String value = dataFormatter.formatCellValue(cell); // from apache poi 5.2.0 on
                System.out.println(value);
            }
        }
        workbook.close();
    }
}