import java.util.*;
import java.lang.*;
import java.io.*;

class Lists {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here

        List<Integer> grade = new ArrayList<>();

        grade.add(2);
        grade.add(3);
        grade.add(5);
        grade.add(5);
        grade.add(6);
        grade.add(4);
        grade.add(5);
        grade.add(4);
        grade.add(3);
        grade.add(4);
        grade.add(5);
        grade.add(2);
        grade.add(6);
        grade.add(3);
        grade.add(5);
        grade.add(5);

        Student1 newStudent = new Student1(grade);
        newStudent.collectMaxGradeAndMinGrade(grade);
        newStudent.average(grade);

        Books book1 = new Books("Mistrz", 2000);
        Books book2 = new Books("Malgosia", 2010);
        Books book3 = new Books("Harry Potter", 2001);
        Books book4 = new Books("Czerwien", 1984);
        Books book5 = new Books("Slowicza Podloga", 2007);
        Books book6 = new Books("Wiedzmin", 1986);
        Books book7 = new Books("Achaja", 2011);

        LinkedList<Books> bookList = new LinkedList<Books>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);

        for(Books book: bookList){
            if (book.getYear() >= 2000) {
                System.out.println(book.bookDescription());
            }
        }
    }
}
class Books {

    private String title;
    private Integer year;

    public Books(String title, Integer year) {

        this.title = title;
        this.year = year;
    }

    public String bookDescription() {
        return "The book " + title + " was released in " + year;
    }

    public Integer getYear() {
        return this.year;
    }
}

class Student1 {
    private List<Integer> grade;

    public Student1(List<Integer> grade) {
        this.grade = grade;
    }

    public void collectMaxGradeAndMinGrade(List<Integer> grade) {

        Integer maxGrade = Collections.max(grade);
        Integer minGrade = Collections.min(grade);

        grade.remove(Collections.max(grade));
        grade.remove(Collections.min(grade));

        System.out.println("Max grade " + maxGrade);
        System.out.println("Min grade " + minGrade);
    }

    public double average(List<Integer> grade) {
        double sum = 0;

        for (int i = 0; i < grade.size(); i++) {
            sum += (grade.get(i));
        }
        if (grade.size() == 2) {
            double average = sum / grade.size();
            System.out.println("Average grade of this Student is : " + average);
        }
        if (grade.size() == 1) {
            System.out.println("Ocena to: " + grade);
        }
        if (grade.size() == 0) {
            System.out.println("Srednia = 0");
        }
        double average = sum / grade.size();
        System.out.println("Average grade of this Student is : " + average);
        return average;
    }
}