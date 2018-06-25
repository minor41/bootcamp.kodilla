import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Lists2 {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        final List<Integer> grades = getRandomGrades();

        Student newStudent = new Student(grades);

        System.out.println("Student: " + newStudent + " average: " + newStudent.average());
        System.out.println("Student: " + newStudent + " average: " + newStudent.average());
        System.out.println("Student: " + newStudent + " average: " + newStudent.average());

    }

    private static List<Integer> getRandomGrades() {
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
        return grade;
    }
}

class Books3 {

    private String title;
    private Integer year;

    public Books3(String title, Integer year) {

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

class Student {

    private List<Integer> grade;

    public Student(List<Integer> grade) {
        this.grade = grade;
    }

    public double average() {
        List<Integer> gradesCopy = new ArrayList<>(grade);
        if (gradesCopy.size() == 0) {
            return 0;
        }

        if (gradesCopy.size() == 1) {
            return gradesCopy.get(0);
        }

        if (gradesCopy.size() == 2) {
            return calculateAverage(gradesCopy);
        }

        Collections.sort(gradesCopy);

        gradesCopy.remove(0);
        gradesCopy.remove(gradesCopy.size() - 1);

        return calculateAverage(gradesCopy);
    }

    private double calculateAverage(List<Integer> gradesCopy) {
        double sum = 0;
        for (int i = 0; i < gradesCopy.size(); i++) {
            sum += (gradesCopy.get(i));
        }
        return sum / gradesCopy.size();
    }
}
