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


# Compartor Vs Comparable 

    when we do sort on primitives , for ex 
    we have Integer arr[] = new Integer[]{3,6,3,3};

#Arrays.sort(arr);

    -In here when we do sort, internally it calls merge sort and merge sort internally calls compareTo() method
    - Provided by the Integer class, Integer class implements Comparable Interface, it provides/Overrides the compareTo() method
    - It picks up to sort the array , that compareTo() methods defines the Natural Ordering of the class.

Arrays.sort(arr,(Integer val1,Integer val 2) -> val1 - val2)
    -In here we provided custom comparator by lambda expression, It internally class the merge sort,
    -and that merge sort internally calls compare() method provided by the user,It will not pick the natural ordering
    -CompareTo() method, as the user provided the custom sorting logic comparator() method.

The same thing, when we do for Objects 

# Let's Assume that there exist car class with carName,carType with constrcutor initialization for both the fields
 
    car carArr = new car[3];
    carArr[0] = new car("Benz", "Petrol");
    carArr[1] = new car("Audi", "diesel");
    carArr[2] = new car("RangeRover", "diesel");

#Arrays.sort(carArr)

    -So when this executes, What do you think it will happens, it sorts,or remains same 
    -It fails as classCastException for compareTo() method is not applicable.
    -as we've seen that when ever arrays.sort executes, it internally calls merge sort, & it internally 
    - checks if any custom compartor provided or not , if not provided it goes for it's own natural ordeing
      - But in this car class , we've not defined any natural ordering,So it fails.

#Arrays.sort(carArr,(car o1,car o2) -> o1.carName.compareTo(o2.carName);

    -Now, what do you think that would happen, if we execute this line,it works fine,
    - How, Internally it calls the merge sort, & it internally checks for the custom/user provided sorting 
    - comparator, based upon the logic the sorting/swapping would take place.

# Now the Question what to do incase if we haven't provided any custom comparator sorting logic.
    - the class need's to implement comparable Functional Interface to override the compareTo() method
    - that internally will be the one & only method that define the default Natural Ordering of the class
    -Then we can call Array.sort(carArr) it works fine,

# Comparator 
            
    -no need to change anything in Object class, can define multiple ways , 
    - can have multiple sorting strategies, compare(T obj1, T obj2) Method need's to implement
# Comparable 
        
    - need to change in Object Class &  have only one natural ordering
    - CompareTo(T Obj) need to override in the object class
# Dequeue

    -Deque is Double Ended Queue Means Addition & Deletion Can be done from either sides of the queue
    -The below methods are available in Dequeue

        addFirst() & offerFirst() - Both does insertion at the first, but incase of
        addFirst() -> throws Exception if insertion fails
        offerFirst() -> returns false if insertion fails
    
         addLast() & offerLast() -> Both does insertion at the end of the queue, but the difference would be
         addLast() -> throws Exception if insertion fails
         offerLast() -> returns false if insertion fails
    
         removeLast() & pollLast() - Both does Deletion at the end, but diff
         removeLast() -> throws exception if deletion fails
         pollLast() -> returns null if queue is empty
    
         removeFirst() & pollFirst() - Both does Deletion at the end, but diff
         removeFirst() -> throws exception if deletion fails
         pollFirst() -> returns null if queue is empty
    
         peekFirst() & getFirst() -> Both retrieve the start/head element from the queue
         peekFirst() -> Returns Null,if queue is empty
         getFirst() -> Returns Exceptions if the queue is empty
    
         peekLast() & getLast() > Both retrieve the start/head element from the queue
         peekLast() -> Returns Null,if queue is empty
         getLast() -> Returns Exceptions if the queue is empty

        push() -> Internally calls addFirst()
        pop() -> Internally calls removeFirst()

    - Methods from Queue can will be available for Dequeue

         1.add() -> Internally calls the addLast() method
         2.offer() -> Internally calls the offerLast() method
         3.remove() -> Internally calls the removeFirst() method
         4.poll() -> Internally calls the pollFirst() method
         5.peek() -> Internally calls the peekFirst() method
         6.element() -> Internally calls the getFirst() method

    -Time Complexity
        - Insertion :(Average it takes O(1) Expect for few case, Like when the queue size threshold reached
                     & trying to insert an element at end or front , then O(n) values are need to copy to new bigger queue
        - Removal : O(1)
        -Search :  O(1)

# Thread Safe Version of ArrayDequeue & PriorityQueue
For Priority Queue -> it's PriorityBlockingQueue which is Thread SafeVersion
For ArrayDequee  -> It's ConcurrentLinkedDeque which is thread SafeVersion
Has the behaviour of Concurrent insertion, removal, and access operations execute safely across multiple threads

![img_1.png](img_1.png)

# List 
    -It's Ordered collection of objects, which allows duplicate values.
    -How it's diffenet from queue's ?
    -Queue is also a collection of Objects, where insertion,deletion,access happens either from the start or end of queue
    - where as in List Insertion,deletion & Acces can be happen at anywhere
    -In List those operation happens via index(Starting from  0)
    -Methods provided by in List Interface
    ![img_2.png](img_2.png)
    ![img_3.png](img_3.png)

# Thread Safe Version of ArrayList
For ArrayList -> it's CopyOnWriteArrayList which is Thread SafeVersion
![img_4.png](img_4.png)
