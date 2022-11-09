<h1>Linked List </h1>
Linked List is a part of the Collection framework present in java.util package. This class is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part.

<hr>
How Does LinkedList work Internally?

Since a LinkedList acts as a dynamic array and we do not have to specify the size while creating it, the size of the list automatically increases when we dynamically add and remove items. And also, the elements are not stored in a continuous fashion. Therefore, there is no need to increase the size. Internally, the LinkedList is implemented using the doubly linked list data structure. The main difference between a normal linked list and a doubly LinkedList is that a doubly linked list contains an extra pointer, typically called the previous pointer, together with the next pointer and data which are there in the singly linked list. 
<hr>
1. LinkedList(): This constructor is used to create an empty linked list. If we wish to create an empty LinkedList with the name ll, then, it can be created as: 

LinkedList ll = new LinkedList();  

2. LinkedList(Collection C): This constructor is used to create an ordered list that contains all the elements of a specified collection, as returned by the collection's iterator. If we wish to create a LinkedList with the name ll, then, it can be created as: 

LinkedList ll = new LinkedList(C);

add(int index, E element)	-- This method Inserts the specified element at the specified position in this list.

add(E e)	This method Appends the specified element to the end of this list.

addAll(int index, Collection<E> c)	This method Inserts all of the elements in the specified collection into this list, starting at the specified position.
  
addFirst(E e)	This method Inserts the specified element at the beginning of this list.
  
addLast(E e)	This method Appends the specified element to the end of this list.
  
clear()	This method removes all of the elements from this list.
  
clone()	This method returns a shallow copy of this LinkedList.
  
contains(Object o)	This method returns true if this list contains the specified element.

  descendingIterator()	This method returns an iterator over the elements in this deque in reverse sequential order.
  
element()	This method retrieves but does not remove, the head (first element) of this list.
  
get(int index)	This method returns the element at the specified position in this list.
  
getFirst()	This method returns the first element in this list.
  
getLast()	This method returns the last element in this list.
