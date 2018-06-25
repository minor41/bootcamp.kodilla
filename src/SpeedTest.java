import java.util.*;
import java.lang.*;
import java.io.*;

class Books2 {
    private String author;
    private String title;

    public Books2 (String author, String title){
        this.author = author;
        this.title = title;
    }

    public String toString() {
        return author + " " + title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books2 books2 = (Books2) o;
        return Objects.equals(author, books2.author) &&
                Objects.equals(title, books2.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(author, title);
    }
}

class ListOfBooks {

    public void speedTestList(){

        List<Books2> bookList = new LinkedList<>();
        for (int i = 0; i < 2000000; i++) {
            bookList.add(new Books2("Author nr: " + i, "Title nr: " + i));
        }
        long begin1 = System.nanoTime();
        bookList.get(0);
        bookList.remove(0);
        long end1 = System.nanoTime();

        System.out.println("Removing time of the first book in the list is " +(end1 - begin1)+ "ms" + "\n");


        long begin2 = System.nanoTime();
        bookList.get(bookList.size() - 1);
        bookList.remove(bookList.size() - 1);
        long end2 = System.nanoTime();

        System.out.println("Removing time of the last book in the list is " + (end2 - begin2) + "ms" + "\n");

        long begin3 = System.nanoTime();
        bookList.add(0, new Books2("Author nr: ", "Title nr: "));
        long end3 = System.nanoTime();

        System.out.println("Adding time of the first book in the list is " +(end3 - begin3)+ "ms" + "\n");


        long begin4 = System.nanoTime();
        bookList.add(1999999, new Books2("Author nr: ", "Title nr: "));
        long end4 = System.nanoTime();

        System.out.println("Adding time of the last book in the list is " + (end4 - begin4) + "ms" +"\n");
    }
}

  class MapSpeedTest {

    public void speedTestMap() {

        Map<Books2, String> bookMap = new HashMap<>();
            for (int j = 0; j < 2000000; j++) {
                bookMap.put(new Books2("Autor " + j, "Title " + j), "Publisher ");
            }


        long begin2 = System.nanoTime();
        bookMap.get(new Books2("Author nr: ", "Title nr: "));
        long end2 = System.nanoTime();

        System.out.println("Wyszukiwanie obiektu po kluczu " +(end2 - begin2)+ "ms" + "\n");


        long begin1 = System.nanoTime();
        bookMap.remove(new Books2("Author nr: ", "Title nr: "));
        long end1 = System.nanoTime();

        System.out.println("Removing time of the book in the Map is " +(end1 - begin1)+ "ms" + "\n");

        long begin3 = System.nanoTime();
        bookMap.put(new Books2("Author ", "Title "), "Publisher ");
        long end3 = System.nanoTime();

        System.out.println("Adding time of new book to the Map is " + (end3 - begin3) + "ms" + "\n");
    }

  }

class Application {

    public static void main(String[] args) throws java.lang.Exception {

        ListOfBooks books = new ListOfBooks();
        MapSpeedTest books2= new MapSpeedTest();

        books.speedTestList();
        books2.speedTestMap();

    }
}

