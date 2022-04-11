package com.syntax.homework4;

public class Book {

    String cover;
    String font;
    String author;
    int pages;
    String title;

    public Book(String cover, String font,String author, int pages, String title) {
        this();
        this.cover = cover;
        this.font = font;
        this.author = author;
        this.pages = pages;

    }

    public Book() {
    System.out.println("yes");
        }

    void displayInfo(){

        System.out.println("Book has " + cover + " cover and the font is " + font + ". Title of the book is " + title + ", the author is " + author + ", and it has " + pages + " pages." );
    }

    public static void main(String[] args) {


    Book book1 = new Book("hard", "Arial","James Jones", 650, "From here to eternity");
    Book book2 = new Book();

    book1.displayInfo();






    }
}
