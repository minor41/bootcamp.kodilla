import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayTester{

    //method prints out only the even elements of an ArrayList
    public void printEven(ArrayList<Integer> theList){
        int temporaryValue = 0;
        for (int n=0; n < theList.size(); n++){
            temporaryValue = theList.get(n);
            //checking if an element is even or odd
            if (temporaryValue % 2 == 0){
                //if reminder of dividing the element by two equals 0,
                //the element is even, so we can print out it.
                System.out.println(temporaryValue);
            }
        }
    }
}

/* Name of the class has to be "Main" only if the class is public. */
class CollectionAsParameter
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //initialising the collection
        ArrayList<Integer> theBigList = new ArrayList<Integer>();
        Random theGenerator = new Random();
        for(int n=0; n < 200; n++){
            //inserting a random number of range 0-99 into the list
            theBigList.add(theGenerator.nextInt(100));
        };
        ArrayTester tester = new ArrayTester();
        tester.printEven(theBigList);
    }
}