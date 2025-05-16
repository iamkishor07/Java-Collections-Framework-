package IterableCollectionInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class IterableCollectionExp {

    public static void main(String[] args)
    {
        System.out.println("Iterable");

        /*
        Available from Java 1.5 Version
        Any Collection in Java -> Iterable is the parent class
        It contains 3 methods & those can be used on all the child collections
        1.hashNext() -> Returns true , if there are more elements in that
        2.next() -> returns the next element in iteration.
        3.remove() -> removes the last element returned by the iterator
         */

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(31);
        list.add(13);
        list.add(12);

        //Using Iterator
        Iterator<Integer> iteratorObj = list.iterator();
        while(iteratorObj.hasNext())
        {
            int val = iteratorObj.next();
            if(val == 13 )
            {
                //As the iterator obj holds the val 13 -> that will be removed
                iteratorObj.remove();
            }
        }

        //Printing after that
        for(int a : list)
        {
            System.out.println(a); // 11 31 12
        }


        //Using forEach method
        //  Available from Java 1.8 Version
        //forEach Method Lambda method is called in forEach
        //It's of Functional interface -> of Consumer interface.

        /*
         default void forEach(Consumer<? super T> action) {
            Objects.requireNonNull(action);
            for (T t : this) {
                action.accept(t);
            }
        }*/
        list.forEach((Integer val) -> System.out.println(val) ); //11 31 12

    }

}
