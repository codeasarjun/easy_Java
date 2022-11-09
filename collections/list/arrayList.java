import java.util.*;

class HelloWorld {
  
    
    public static void main(String[] args) {
        List <String> studnet=new ArrayList<>(); // creating arraylist


        studnet.add("Bob");
        studnet.add("adam");
        Iterator n=studnet.iterator(); // accessing elements 
        while(n.hasNext())
        {
            System.out.println(n.next());
        }

      // foreach looop can also get used for traverse 
       
    }
