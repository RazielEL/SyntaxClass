package com.syntax.class023;

public abstract class File {

    abstract void open();
    void close(){
        System.out.println("Close the file");
    }
    void edit(){
        System.out.println("Edit the file");
    }

}

class JavaFile extends File {

    void open() {
        System.out.println("You need sublime.text");
    }
}
    class WordFile extends File {

        void open() {
            System.out.println("You need MS Word");
        }
    }

    class PdfFile extends File {
        void open() {
            System.out.println("You need acrobat reader");
        }
    }


class Files{
    public static void main (String[] args){

        File file1 = new JavaFile();
        File file2 = new WordFile();
        File file3 = new PdfFile();

        File[] pliki = {new JavaFile(), new WordFile(), new PdfFile()};

        for (File funkcjePlikow : pliki){
            funkcjePlikow.close();
            funkcjePlikow.edit();
            funkcjePlikow.open();
        }


    }
}




