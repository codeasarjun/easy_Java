import java.util.*;

class HelloWorld {
  
    
    public static void main(String[] args) {
       
      SortedSet<Integer> st=new TreeSet<>();
      st.add(5);
      st.add(2);
      st.add(3);
      st.add(4);
      Iterator itr=st.iterator();
      
      while(itr.hasNext())
      {
        System.out.print(itr.next());
      }

    }
}
// it will print the sorted order as 2345
