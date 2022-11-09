import java.util.*;

class HelloWorld {
  
    
    public static void main(String[] args) {
        Stack <String> studnet=new Stack<>(); // creating arraylist
        
        studnet.push("Bob");
        studnet.push("adam");
        Iterator n=studnet.iterator(); // accessing elements 
        while(n.hasNext())
        {
            System.out.println(n.next());
        }

       
    }
}
