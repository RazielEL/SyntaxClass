package com.syntax.class029;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo {
    public static void main (String[] args) throws IOException {

        String path = "/home/razz/Documents/test01.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xlsx = new XSSFWorkbook(fileInputStream);

        Sheet sheet = xlsx.getSheet("Sheet1");
        System.out.println(xlsx.getSheetIndex("Sheet1"));















    }
}
