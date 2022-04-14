package com.syntax.class029;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo4 {
    public static void main (String[] args) throws IOException {

        String path = "/home/razz/Documents/test01.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        // list of maps to store data from excel, each map will store the data from each row
        List<Map<String, String>> excelData = new ArrayList<>();



        // getting header from excel file, so we can use it as a keys for the map (name, last name, city etc
        Row row = sheet.getRow(0);
        // loop for getting all the rows from the sheet except the header
        for (int i = 1; i<sheet.getPhysicalNumberOfRows(); i++){
            // for each row we create a new map so that w dont override the data for all the rows
            LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
            // getting all the rows except the header
            Row headerRow = sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++){
                // te dwie linijki to z poprzedniego byly, ignorowac, te nizej dwie
                Cell cell2 = sheet.getRow(i).getCell(j);
                System.out.print(cell2 + " ");
                // we use the header row to get the keys and the row to get the values from the data
                linkedHashMap.put(headerRow.getCell(j).toString(), row.getCell(j).toString());
                excelData.add(linkedHashMap);
            }
            System.out.println();
        }

        System.out.println(excelData);







    }
}
