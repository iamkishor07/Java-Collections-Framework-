# Java-Collections-Framework-
Added in java 1.2 Version
Collections nothing but group of objects, present in java.util package
Collections Framework provides us the architecture to mange "group of objects" i.e update,add,delete,search etc

![image](https://github.com/user-attachments/assets/ac9e162e-a654-40ed-9527-942cfa73830f)

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

#Arrays.sort(arr,(Integer val1,Integer val 2) -> val1 - val2)
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

![image](https://github.com/user-attachments/assets/ec5deeb4-4bac-4c3e-bdd1-a41f42276ad2)

# List 
    -It's Ordered collection of objects, which allows duplicate values.
    -How it's diffenet from queue's ?
    -Queue is also a collection of Objects, where insertion,deletion,access happens either from the start or end of queue
    - where as in List Insertion,deletion & Acces can be happen at anywhere
    -In List those operation happens via index(Starting from  0)
    -Methods provided by in List Interface
![image](https://github.com/user-attachments/assets/5cccb9af-0489-401f-a997-f5df46aeecb5)

![image](https://github.com/user-attachments/assets/f56a3bb4-ac82-4ed9-ba25-ba1399a3753e)

    -Time Complexity
        -Insertion:
            -O(1): when inserting an element at the end of list , when space is sufficient
            -O(n): when inserting an element at particular index,then requires shifting of elements 
            -O(n): when array size reaches the threshold & try to insert at the end, then also it requires O(n) to copy 
                    all the elements to the new array 
        -Deletion:
            -O(n) : after deletion,shifting of element requries O(n)    
        -search 
            -O(1) : by indexes it takes constant time


# Thread Safe Version of ArrayList
For ArrayList -> it's CopyOnWriteArrayList which is Thread SafeVersion

![image](https://github.com/user-attachments/assets/30dbfde1-a7a7-4346-92ef-92d03b4ac56b)

# LinkedList 
    - LinkedList is the concrete class, which implements both Dequeue & List Interface
    - It supports Dequeue Methods like "getFirst()", "getLast()", "removeLast()" etc And
    - It supports Index Based Operations like "get(index)","add(index,val)" etc..
    - It's faster than ArrayList, becuase there is "no shifting of element requires"
    -Time Complexity
        -Insertion:
            -O(1): Insertion at end or start 
            -O(n): Insertion at particular index for lookup O(n) + O(1) for adding 
        -Deletion:
            -O(1) : deletion at end or start
            -O(n) : deletion at particular index for lookup O(n) + O(1) for removal
        -search 
            -O(n) : Need to traverse whole linkedlist in worst case
![image](https://github.com/user-attachments/assets/0da2115d-227d-418e-8111-135562ba83f5)

# Vector
    -Exactly same as ArrayList,elements can be access via index
    -But it's Thread Safe
    -Puts lock on each & every Operation it performs on vector
    -Less efficient than arrayList as for each operation it do lock/unlock internally
    -Each & every method in vector is synchronized.
![image](https://github.com/user-attachments/assets/881fd5f9-5bd6-49a5-a88d-aafa8a7a982c)

# Stack
    -It's child concrete class of Vector class
    -we can achieve LIFO (principle ) through Dequeue , but that is not a threadSafe 
    -Stack is ThreadSafe as it's child of Vector 
    -Time Complexity
        -Insertion:
            -O(1): Insertion from end only
        -Deletion:
            -O(1) : deletion from end only
        -search
            -O(n) : Need to traverse whole stack , worst case need to traverse entire stack elements
![image](https://github.com/user-attachments/assets/55b5220e-e451-45ac-ab17-159c80d9b5de)

# Map
![img_5](https://github.com/user-attachments/assets/8342b522-f6a7-4056-a620-5e05a38654eb)
    -I'ts an interface & it's implementation's are
        - HashMap: do not maintain the order
        - HashTable: Synchronized version of HashMap
        - LinkedHashMap : maintain insertion order / Maintain Access order
        - TreeMap : sorts data internally
    - Object that maps key to values.
    - Cannot contain duplicate keys, even if you try to insert, it'll overwrrite it with new values.
![img](https://github.com/user-attachments/assets/237dbe5a-7c5c-46a1-bcad-e282c3a59ea2)
![img_1](https://github.com/user-attachments/assets/40507711-c1b0-40f2-96c1-cd5e1f338b5f)


# Sorted Map
    -Methods available in sorted Map Interface
    -SortedMap<K,V> headMap(K key) -> returns all the values from start to the specifed key(exclusive)
    -SortedMap<K,V> tailMap(K key) -> returns all the values from end to the specifed key(Inclusive)
    -K firstKey() -> returns the first key
    -K lastKey() -> returns the last key
# Navigable Map
![img_3](https://github.com/user-attachments/assets/90ac3e98-4627-4683-bea6-7bed95df40f4)
![img_2](https://github.com/user-attachments/assets/ca2e0312-a235-434a-9a21-df76593561a4)
![img_4](https://github.com/user-attachments/assets/96b1d503-b382-43e7-a686-9c1dda2a2d2d)

# Set
    -Set doesn't contain duplicates(Internally it uses hashMap) & it can have only 1 null value
    -Set is unordered Collection,means objects inside set doesn't follow insertion order
    -Unlike list,set can not be access via index.
    -All methods declared in Collection Interface are only availbe in set Interface , No new method is added
    
    -Its Implementing classes are HashSet,LinkedHashSet, TreeSet
# HashSet
    -It doesn't maintain insertion order as it internally uses HashMap.
    -As it uses HashMap ,It has key-value pair as 2 values,where as the hashSet contains only one value.
    -During method invocation ,it stored the element in the key part & in value it stores the dummy Object
    - map.put(element,new Object())
    -It is not a thread safe(has hashMap is also not a threadsafe)
    -newKeySet method present in concurrentHashMap class is used to create  threadSafe set
    -It's time complexity is same as the hashMap,(Internally it implements it)
# LinkedHashSet 
    -It internally uses LinkedHashMap
    -Maintains insertion Order of the elements,but not access order
    -It is not a thread safe
    -We can have threadsafe by using collections.synchronizedMap(new LinkedHashSet<>())
    -Internally it adds synchronized keyword on it's method.
# TreeSet
    -It internally uses TreeMap
    -It can not store null value,It is same as treemap

    
