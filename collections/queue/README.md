Queue interface maintains the first-in-first-out order. 

It can be defined as an ordered list that is used to hold the elements postions in FIFO.

There are various classes like -

PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.
Queue<String> q1 = new PriorityQueue();  
Queue<String> q2 = new ArrayDeque();  


**  PriorityQueue class impletments the Queue interface. It holds the elements or objects which are to be processed by their priorities.
PriorityQueue doesn’t permit null.
We can’t create a PriorityQueue of Objects that are non-comparable
PriorityQueue are unbound queues.
The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for the least value, the head is one of



** Deque stands for a double-ended queue which enables us to perform the operations at both the ends.

Deque can be instantiated as:

Deque d = new ArrayDeque();  
