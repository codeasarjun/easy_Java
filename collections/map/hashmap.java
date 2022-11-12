import java.util.*;

class HelloWorld {
  
    
    public static void main(String[] args) {
       
      Map <Integer,String> hm=new HashMap<>();
      // can also create like 
      //HashMap<Integer,String> hm=new HashMap<>();
      hm.put(4,"MCA");
      hm.put(2, "BCA");
      for(Map.Entry<Integer,String> h:hm.entrySet())
      {
        System.out.println(h.getKey()+" "+h.getValue());
      }
     // hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
}

//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);  
      //Sorted according to the provided Comparator  
      
      //Performs an action for each element of this stream  
       
