package com.syntax.class028;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.syntax.class023.File;

import java.io.FileInputStream;
import java.io.IOException;

public class ApachePoi {
    public static void main (String[] args) throws IOException {


        String path = "/home/razz/Documents/test01.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream); // musimy add exception

        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        Row row = sheet.getRow(0);

        System.out.println(row.getCell(0));

    }
}
