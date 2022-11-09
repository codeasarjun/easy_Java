import java.util.*;
class creating_stack {
    
    
    public static void main(String[] args) {
       Stack s=new Stack<>();// in this we can store any data type
       s.push("Hello");
       s.push(1);
       System.out.println(s.size());// it gives size of stack 

       Stack<String> s1=new Stack<>();// can only hold string 

       s1.push("hello");
       s1.push("bob");
       System.out.println(s1);

    }
}
