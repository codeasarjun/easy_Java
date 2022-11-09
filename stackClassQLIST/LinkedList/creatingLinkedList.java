import java.util.*;
class creatingLinkedList {
    
    
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>(); //creatin linkedlist class object, can have String only 

        //LinkedList ll =new LinkedList(); // can define like this too, it can take any data type 
        ll.add("Hello");
        ll.add("Sam");
        int x=ll.size(); // get the size
        ll.add(1,"Mr.");// will add @ index 1

        ll.set(1, "ram");// will change the Sam to ram
        ll.remove(1);// remove item at index 1
        ll.remove("hello");// remove hello if present 

        
        
        System.out.println(x);


    }
