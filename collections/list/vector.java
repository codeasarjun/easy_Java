import java.util.*;

class vector {
  
    
    public static void main(String[] args) {
        Vector <String> studnet=new Vector<>(); // creating arraylist
        
        studnet.add("Bob");
        studnet.add("adam");
        Iterator n=studnet.iterator(); // accessing elements 
        while(n.hasNext())
        {
            System.out.println(n.next());
        }

       
    }
}
