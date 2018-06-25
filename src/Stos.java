import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Book2{
    String title;
    String author;
    int year;

    public Book2(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString(){
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }

    public String  getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
}

class Order{
    Book2 book;
    LocalDate dateOfOrder;

    public Order(Book2 book, int year, int month, int day){
        this.book = book;
        this.dateOfOrder = LocalDate.of(year, month, day);
    }

    public String toString(){
        return "Order created: " + dateOfOrder + "\n" +
                "ordered book: " + book;

    }

    public Book2 getBook(){
        return book;
    }

    public LocalDate getDateOfOrder(){
        return dateOfOrder;
    }
}

class OrdersQueueExample {
    public static void main(String[] args) throws java.lang.Exception {
        Book2 book1 = new Book2("Pani Jeziora", "Andrzej Sapkowski", 1993);
        Book2 book2 = new Book2("Viron","Andrzej Ziemiański", 2017);
        Book2 book3 = new Book2("Czerwien", "John Doe", 2015);
        Book2 book4 = new Book2("Pieśń ognia i lodu","J. R. R.", 2000);
        Book2 book5 = new Book2("40 Twarzy Szarego", "Jan Kowalski", 1997);

        Order order1 = new Order(book1, 2017, 12, 27);
        Order order2 = new Order(book5, 2017, 12, 28);
        Order order3 = new Order(book4, 20017, 12, 20);
        Order order4 = new Order(book2, 2018, 1, 2);
        Order order5 = new Order(book3, 2018, 1, 3);

        ArrayDeque<Order> theOrders = new ArrayDeque<Order>();

        theOrders.push(order5);
        theOrders.push(order2);
        theOrders.push(order3);
        theOrders.push(order1);
        theOrders.push(order4);

        System.out.println("Queue's size is: " + theOrders.size());

        Order finishedOrder;
        finishedOrder = theOrders.pop();
        finishedOrder = theOrders.pop();
        finishedOrder = theOrders.pop();
        finishedOrder = theOrders.pop();
        finishedOrder = theOrders.pop();

        System.out.println("Queue is emptied. It's size: " + theOrders.size() + "\n");

        System.out.println("Last order taken from queue was:\n" + finishedOrder);
    }
}
