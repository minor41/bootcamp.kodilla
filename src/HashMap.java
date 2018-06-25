

import java.util.*;
import java.lang.*;
import java.io.*;

class LastExerciseM2 {

    public static void main(String[] args) throws java.lang.Exception {



        Students student1 = new Students("Ola", "Kowalska", 15);
        Students student2 = new Students("Jola", "Pozna", 16);
        Students student3 = new Students( "Adam", "Pudzianowski", 14);
        Students student4 = new Students("Piotr", "Wielki", 33);

        List<Integer> grades1 = new ArrayList<Integer>(Arrays.asList(4, 4, 4, 5, 5));
        List<Integer> grades2 = new ArrayList<Integer>(Arrays.asList(3, 4, 6, 2, 1));
        List<Integer> grades3 = new ArrayList<Integer>(Arrays.asList(2, 6, 5, 4, 6));
        List<Integer> grades4 = new ArrayList<Integer>(Arrays.asList(6, 6, 6, 6, 5));

        HashMap<Students, List<Integer>> studentsAverage = new HashMap<Students, List<Integer>>();

        studentsAverage.put(student1, grades1);
        studentsAverage.put(student2, grades2);
        studentsAverage.put(student3, grades3);
        studentsAverage.put(student4, grades4);

        for (Map.Entry<Students, List<Integer>> entry : studentsAverage.entrySet()) {

            double average = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                average += (Integer) entry.getValue().get(i);
            }
            average = average / entry.getValue().size();
            System.out.println("Student Id: "+ entry.getKey() + "\n" + "Srednia ocen to " + average+ "\n");
        }
    }
}
class Students {
    private String firstName;
    private String lastName;
    private Integer age;

    public Students(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public boolean equals(Object o) {
        final Students e = (Students) o;
        return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.age.equals(e.age);
    }

    @Override
    public int hashCode() {
        return age;

    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", age: " + age;
    }
}
