package com.syntax.class028;

import com.syntax.class023.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataImport {
    public static void main (String[] args) throws IOException {

        String path = "/home/razz/IdeaProjects/SyntaxClass/src/com/syntax/class028/HWFile";
        // lokalizacja pliku
        FileInputStream fileInputStream = new FileInputStream(path); //adding exception
        Properties properties = new Properties();

        properties.load(fileInputStream);

        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("url"));
        System.out.println(properties.get("browser"));










    }
}
