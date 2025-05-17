# Java-Collections-Framework-
Added in java 1.2 Version
Collections nothing but group of objects, present in java.util package
Collections Framework provides us the architecture to mange "group of objects" i.e update,add,delete,search etc

![img.png](img.png)

![image](https://github.com/user-attachments/assets/1c4a668e-1384-4f70-8f06-0cd695b94005)


Iterable Interface provides the below methods
![image](https://github.com/user-attachments/assets/8a45d7d0-c10f-43f1-8428-b727abccc6cc)


Collection Interface provides the below methods
![image](https://github.com/user-attachments/assets/7f34ab6a-07d4-46f0-8f3e-a1c22bda8383)

Queue Interface provides the below methods
![image](https://github.com/user-attachments/assets/742c80a4-6fb9-4a5d-b78a-958192a19dd6)




![image](https://github.com/user-attachments/assets/1c4a668e-1384-4f70-8f06-0cd695b94005)


Iterable Interface provides the below methods
![image](https://github.com/user-attachments/assets/8a45d7d0-c10f-43f1-8428-b727abccc6cc)


Collection Interface provides the below methods
![image](https://github.com/user-attachments/assets/7f34ab6a-07d4-46f0-8f3e-a1c22bda8383)

Queue Interface provides the below methods
![image](https://github.com/user-attachments/assets/742c80a4-6fb9-4a5d-b78a-958192a19dd6)


#Compartor Vs Comparable 

when we do sort on primitives , for ex 
we have Integer arr[] = new Integer[]{3,6,3,3};

Arrays.sort(arr);
    -In here when we do sort, internally it calls merge sort and merge sort internally calls compareTo() method
    - Provided by the Integer class, Integer class implements Comparable Interface, it provides/Overrides the compareTo() method
    - It picks up to sort the array , that compareTo() methods defines the Natural Ordering of the class.

Arrays.sort(arr,(Integer val1,Integer val 2) -> val1 - val2)
    -In here we provided custom comparator by lambda expression, It internally class the merge sort,
    -and that merge sort internally calls compare() method provided by the user,It will not pick the natural ordering
    -CompareTo() method, as the user provided the custom sorting logic comparator() method.

The same thing, when we do for Objects 

#Let's Assume that there exist car class with carName,carType with constrcutor initialization for both the fields
 
car carArr = new car[3];
carArr[0] = new car("Benz", "Petrol");
carArr[1] = new car("Audi", "diesel");
carArr[2] = new car("RangeRover", "diesel");

Arrays.sort(carArr);
    -So when this executes, What do you think it will happens, it sorts,or remains same 
    -It fails as classCastException for compareTo() method is not applicable.
    -as we've seen that when ever arrays.sort executes, it internally calls merge sort, & it internally 
    - checks if any custom compartor provided or not , if not provided it goes for it's own natural ordeing
    - But in this car class , we've not defined any natural ordering,So it fails.

Arrays.sort(carArr,(car o1,car o2) -> o1.carName.compareTo(o2.carName);
    -Now, what do you think that would happen, if we execute this line,it works fine,
    - How, Internally it calls the merge sort, & it internally checks for the custom/user provided sorting 
    - comparator, based upon the logic the sorting/swapping would take place.

# Now the Question what to do incase if we haven't provided any custom comparator sorting logic.
    - the class need's to implement comparable Functional Interface to override the compareTo() method
    - that internally will be the one & only method that define the default Natural Ordering of the class
    -Then we can call Array.sort(carArr) it works fine,

Comparator -> no need to change anything in Object class, can define multiple ways , 
            - can have multiple sorting strategies, compare(T obj1, T obj2) Method need's to implement
Comparable -> need to change in Object Class &  have only one natural ordering 
            - CompareTo(T Obj) need to override in the object class