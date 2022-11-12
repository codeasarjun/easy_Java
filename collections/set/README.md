It represents the unordered set of elements which doesn't allow us to store the duplicate items.

We can store at most one null value in Set. 

Set is implemented by HashSet, LinkedHashSet, and TreeSet.

Set<data-type> s1 = new HashSet<data-type>();  
Set<data-type> s2 = new LinkedHashSet<data-type>();  
Set<data-type> s3 = new TreeSet<data-type>();  

HashSet class implements Set Interface. 
It represents the collection that uses a hash table for storage. Hashing is used to store the elements in the HashSet. It contains unique items.

SortedSet is the alternate of Set interface that provides a total ordering on its elements. The elements of the SortedSet are arranged in the increasing (ascending) order. The SortedSet provides the additional methods that inhibit the natural ordering of the elements.

The SortedSet can be instantiated as:

SortedSet<data-type> set = new TreeSet();  
