import java.time.LocalDate;
import java.util.*;
import java.lang.*;
import java.io.*;

class Book {
    private String bookTitle;
    private String bookAuthor;
    private Integer yearOfRelease;

    public Book (String bookTitle, String bookAuthor, Integer yearOfRelease){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookTitle, book.bookTitle) &&
                Objects.equals(bookAuthor, book.bookAuthor) &&
                Objects.equals(yearOfRelease, book.yearOfRelease);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookTitle, bookAuthor, yearOfRelease);
    }

    @Override
    public String toString() {
        return "Title: " + getBookTitle() + " , Author: " + getBookAuthor() + " , release year: " + getYearOfRelease() + "\n";
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public Integer getYearOfRelease() {
        return yearOfRelease;
    }
}

class HashSetExample {

    public static void main (String[] args) throws java.lang.Exception {

        Book book1 = new Book("Pomnik Cesarzowej Achai I", "Andrzej Ziemianski", 2009);
        Book book2 = new Book("Pomnik Cesarzowej Achai II", "Andrzej Ziemianski", 2009);
        Book book3 = new Book("Pomnik Cesarzowej Achai III", "Andrzej Ziemianski", 2014);
        Book book4 = new Book("Pomnik Cesarzowej Achai IV", "Andrzej Ziemianski", 2014);
        Book book5 = new Book("Pomnik Cesarzowej Achai V", "Andrzej Ziemianski", 2016);

        HashSet<Book> librarySet = new HashSet<Book>();

        librarySet.add(book1);
        librarySet.add(book2);
        librarySet.add(book3);
        librarySet.add(book4);
        librarySet.add(book5);

        for(Book library: librarySet){
            if(library.getYearOfRelease() < 2010){
                System.out.println(library);
            }
        }

    }
}


