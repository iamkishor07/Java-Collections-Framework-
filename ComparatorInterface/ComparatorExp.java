package ComparatorInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Human implements Comparable<Human>
{
    public Human(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return gender +" "+ name;
    }

    String name;
    String gender;

    ///** provided default natural ordering , if not provided any other compartor
    @Override
    public int compareTo(Human o) {
        return this.name.compareTo(o.name);
    }
}

public class ComparatorExp {
    public static void main(String[] args) {

        //Comparator is functional interface, it contains one method
        // which is Compare( T ob1 , T ob2) takes two parameters
        //Method returns
        //1 -> if the ob1 is greater than ob2
        //0 -> if the ob1 & ob2 is equal
        //-1 -> if the ob1 is smaller than ob2

        Integer[] arr = new Integer[]{1,3,4,2};

        Arrays.sort(arr);
        ///*** If you don't provide your own Comparator , internally it uses compareTo() method
        ///*** which is already implemented by Integer class for Natural Ordering by default.


        Arrays.sort(arr,(val1, val2) -> val1 - val2); //Sorts in ascending order
        ///*** If you provide your own Comparator , internally it uses compare() method for yours

        Arrays.sort(arr,(val1, val2) -> val2 - val1); //Sorts in descending order

        //the arrays.sort method on Non-Primitives internally calls the mergeSort
        // Internally the below mergeSort method will call
        /*
                 private static void mergeSort(Object[] src,  Object[] dest, int low, int high, int off,
                  Comparator c) {
                int length = high - low;

                // Insertion sort on smallest arrays
                if (length < INSERTIONSORT_THRESHOLD) {
                    for (int i=low; i<high; i++)
                        for (int j=i; j>low && c.compare(dest[j-1], dest[j])>0; j--)
                            swap(dest, j, j-1);
                    return;
                }

            compareTo -> method is used to swap elements
            Here c -> means the comparator which we have passed in Arrays.sort(arr,c)
            So internally it calls the our compare method with 2 parameters & decides whether to swap or not
         */

        ///*** Now creating a new array of Humans & try to sort it
        Human[] humans = new Human[3];
        humans[0] = new Human("M","Man");
        humans[1] = new Human("F","Women");
        humans[2] = new Human("M","Boy");

       // Arrays.sort(humans); ///*** Throws exception
        ///*** As we don't provide comparator -> internally it merge sort uses compareTo() method by defaut
        ///*** for natural ordering of comparable Functional Interface , but as soon as it executes the above
        ///*** method , there is no method called compareTo() -> for ordering in Human class, it fails


        Arrays.sort(humans, (Human ob1,Human ob2) -> ob1.gender.compareTo(ob2.gender)); ///*** THis works
        ///*** As we are provinding the lambda expression of compareTo method,as the merge sort
        ///** Internally it uses compare method that is of comparator Funtional Interface , so that invokes
        ///*** user provided comparator & sort's the array

        Arrays.sort(humans);
        ///*** This will work, One Human Class has Defined / Provided Implementation of CompareTo() method
        ///*** of the Comparable functional interface, if no comparator is provided by default it will execute
        ///*** it's natual ordering of the compareTo() method, if this method is not provided in source code class , it fails
        for(Human a : humans)
        {
            System.out.println(a);
        }

        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(11);
        list.add(1);

        Collections.sort(list);
        ///** Internally Collections.sort Converts list to Array & sorts that.
    }


}
