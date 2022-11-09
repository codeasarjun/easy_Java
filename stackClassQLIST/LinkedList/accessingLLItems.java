import java.util.*;
class accessingLLItems {
    
    
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>(); //creatin linkedlist class object, can have String only 

        //LinkedList ll =new LinkedList(); // can define like this too, it can take any data type 
        ll.add("Hello");
        ll.add("Sam");
        int x=ll.size(); // get the size
        for(int i=0;i<x;i++)
        {
            System.out.println(ll.get(i));
        }
        // also we can access wiht for each loop

        for(String s:ll)
        {
            System.out.println(s);
        }


    }
}
