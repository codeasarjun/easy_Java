import java.util.*;

class HelloWorld {
  
    
    public static void main(String[] args) {
       
        Deque<String> dq=new ArrayDeque<String>();
        dq.add("MCA");
        for(String i:dq)
        {
            System.out.println(i);
        }
    }
}
