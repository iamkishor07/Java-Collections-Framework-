package CollectionsUtilityClassMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args)
    {
        //Collections -> it's an utility class which provides certain methods /Operations
        //to perform on the Collections
        /*
            that methods include searching,sorting,reverse,max,min etc..
            where as collection is an interface which provides generic methods which are
            available for all the collections
         */

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(14);
        list.add(1);
        list.add(41);

        //Sort
        Collections.sort(list);
        System.out.println("Sorted the list");

        //reversed
        Collections.reverse(list);
        list.forEach((Integer val) -> System.out.println(val));

        //MaxValue
        System.out.println("maxVal " + Collections.max(list));
        //MinValue
        System.out.println("minVal " + Collections.min(list));

        //reversed
        Collections.reverse(list);
        list.forEach((Integer val) -> System.out.println(val));


    }
}
