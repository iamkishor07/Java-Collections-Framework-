package ComparableInterface;

import java.util.Arrays;

 class Car implements Comparable<Car> {
    String carName;
    String carType;

    public Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    @Override
    public int compareTo(Car o) {
        return o.carType.compareTo(this.carType);
    }

    @Override
    public String toString()
    {
        return carName + " " + carType;
    }

}
public class ComparableExp {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2, 1, 4, 3};

        ///***  the Arrays.sort(arr) -> method internally calls merge sort , where we've not provided anu sort of
        //comparator , but in java the merge sort uses compareTo method from comparable interface.
        Arrays.sort(arr);
        //As we run this , it will sort the values in the array by using the compareTo method
        ///***  that compareTo() method of comparable Interface is provided by the Integer Class.
        ///***  So that method will be invoked in case of integer arr.
        /*
             private static void mergeSort(Object[] src,
                                      Object[] dest,
                                      int low,
                                      int high,
                                      int off) {
            int length = high - low;

            // Insertion sort on smallest arrays
            if (length < INSERTIONSORT_THRESHOLD) {
                for (int i=low; i<high; i++)
                    for (int j=i; j>low &&
                             ((Comparable) dest[j-1]).compareTo(dest[j])>0; j--)
                        swap(dest, j, j-1);
                return;
            }

            here the swap is happeing with rep to compareTo method .
         */


        Car[] cars = new Car[3];
        cars[0] = new Car("Benz", "Petrol");
        cars[1] = new Car("Audi", "diesel");
        cars[2] = new Car("RangeRover", "diesel");

        Arrays.sort(cars);
        //When we call arrays.sort() method on the Non-Primitives it internally calls merge sort
        //that internally calls the compareTo() method of the comparable functional interface.
        //as soon as we run will get the below error
        /*
         Exception in thread "main" java.lang.ClassCastException:
                class ComparableInterface.ComparableExp.Car cannot be cast to class java.lang.Comparable
                (ComparableInterface.ComparableExp.Car is in unnamed module of loader 'app';
                java.lang.Comparable is in module java.base of loader 'bootstrap')

         */


        //that compareTo() method of comparable Interface is provided by the Integer Class.
        //So that method will be invoked in case of integer arr. But as in here the car class
        //doesn't have any compareTo() method to invoke ,as it throws exception ClassCastException.

        ///***  As if we provide the compareTo() method int the car class , it will sort the values

        Arrays.sort(cars); ///** this will work, as internally it calls merge sort,if no other compartor provided
        ///*** it internally tries to sort for the natural ordering , For that natural ordering is defined by the
        ///*** compareTo() method by the class,It can have only one.

        for (Car c : cars) {
            System.out.println(c);
        }
    }

}