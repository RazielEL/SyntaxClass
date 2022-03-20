package com.syntax.class023;

public class Browser {
    void openBrowser(){
        System.out.println("Opening the browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website " + websiteLink);
    }
    void testThePage(){
        System.out.println("Testing the page");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}

class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the browser Google chrome");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website " + websiteLink+ " in google chrome");
    }
    void testThePage(){
        System.out.println("Testing the page in google chrome");
    }
    void closeBrowser(){
        System.out.println("Closing the browser in google chrome");
    }


}

class Firefox extends Browser {
    void openBrowser() {
        System.out.println("Opening the browser Firefox");
    }

    void loadPage(String websiteLink) {
        System.out.println("loading the website " + websiteLink + " in Firefox");
    }

    void testThePage() {
        System.out.println("Testing the page in firefox");
    }

    void closeBrowser() {
        System.out.println("Closing the browser in firefox");
    }

}

class Safari extends Browser {
    void openBrowser() {
        System.out.println("Opening the browser Safari");
    }

    void loadPage(String websiteLink) {
        System.out.println("loading the website " + websiteLink + " in Safari");
    }

    void testThePage() {
        System.out.println("Testing the page in Safari");
    }

    void closeBrowser() {
        System.out.println("Closing the browser in Safari");
    }

}

class IEBrowser extends Browser {
    void openBrowser() {
        System.out.println("Opening the browser IE Browser");
    }

    void loadPage(String websiteLink) {
        System.out.println("loading the website " + websiteLink + " in IE Browser");
    }

    void testThePage() {
        System.out.println("Testing the page in IE Browser");
    }

    void closeBrowser() {
        System.out.println("Closing the browser in IE Browser");
    }

}

class Browsers {
    public static void main(String[] args){
    Browser gch = new GoogleChrome();
    Browser ff = new Firefox();
    Browser ie = new IEBrowser();
    Browser safari = new Safari();


   Browser[] browsers = {new GoogleChrome(), new Firefox(), new IEBrowser(), new Safari()};

   for (Browser browser : browsers){
       browser.closeBrowser();
       browser.openBrowser();
       browser.loadPage("www.syntax.com");
       browser.testThePage();
   }



    }
}