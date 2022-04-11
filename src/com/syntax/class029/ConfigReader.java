package com.syntax.class029;

import com.syntax.class023.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String getProperty (String key) throws IOException {

        String path = "/home/razz/IdeaProjects/SyntaxClass/src/com/syntax/class029/Config.properties";
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties.getProperty(key);



    }
}
