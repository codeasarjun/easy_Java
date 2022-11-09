import java.util.*;

class HelloWorld {
  
    
    public static void main(String[] args) {
        List <String> studnet=new LinkedList<>(); // creating arraylist
        // can also access decalre as 
        // 
        //LinkedList<String> studnet=new LinkedList<>();

        studnet.add("Bob");
        studnet.add("adam");
        Iterator n=studnet.iterator(); // accessing elements 
        while(n.hasNext())
        {
            System.out.println(n.next());
        }

       
    }
}
