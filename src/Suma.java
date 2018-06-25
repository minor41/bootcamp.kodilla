import java.util.*;

class WhileLoop {
    public static void main(String[] args) {
        int sumaA = 1000;
        int sumaB = 0;
        int counter = 0;
        Random randomGenerator = new Random();
        while (sumaA>sumaB) {
            counter++;
            System.out.println("Numer przebiegu petli " + counter);
            sumaA += randomGenerator.nextInt(9);
            sumaB += randomGenerator.nextInt(50);
            if(sumaA > sumaB)  {
                System.out.println("Suma A = " + sumaA);
                System.out.println("Suma B = " + sumaB);
            }
        }
        System.out.println("Suma A = " + sumaA);
        System.out.println("Suma B = " + sumaB);
    }
}

