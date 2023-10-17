/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ATS
 */
public class Book {
    
    private String name;
    private int pages;
    private int year;
    
    public Book(String bookName, int bookPages, int bookYear){
        this.name = bookName;
        this.pages = bookPages;
        this.year = bookYear;
    }
    
    public String getBookName(){
        return this.name;
    }
    
    public String toString(){
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
    
}
