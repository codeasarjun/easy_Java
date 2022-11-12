import java.util.*;

class HelloWorld {
  
    
    public static void main(String[] args) {
       
       HashSet<String> hs=new HashSet<>();
       hs.add("class");
       hs.add("section");
       Iterator itr=hs.iterator();

       while(itr.hasNext())
       {
        System.out.println(itr.next());
       }
    }
}
