package com.syntax.class029;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excel {
    public static void main (String[] args) throws IOException {

        String path = "/home/razz/Documents/test01.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xlsx = new XSSFWorkbook(fileInputStream);

        Sheet sheet = xlsx.getSheet("Sheet1");
        System.out.println(xlsx.getSheetIndex("Sheet1"));

        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        Cell cell1 = row.getCell(1);

        System.out.println("----------------------------------");

        System.out.println(cell);
        System.out.println(cell1);

        System.out.println("----------------------------------");

        System.out.println(sheet.getRow(0).getCell(0));
        System.out.println(sheet.getRow(0).getCell(1));

        System.out.println("----------------------------------");
        System.out.println("----------------------------------");


        for (int i = 0; i<sheet.getPhysicalNumberOfRows(); i++){
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++){

                Cell cell2 = sheet.getRow(i).getCell(j);
                System.out.print(cell2 + " ");
            }
            System.out.println();
        }




    }
}
