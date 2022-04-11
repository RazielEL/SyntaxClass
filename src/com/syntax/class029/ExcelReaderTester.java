package com.syntax.class029;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main (String[] args) throws IOException {
        String path = "/home/razz/Documents/test01.xlsx";
        List<Map<String, String>> excelData = ExcelReader.getData(path, "Sheet1");
        System.out.println(excelData.get(1).get("First Name"));

    }
}
