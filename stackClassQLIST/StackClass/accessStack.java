import java.util.*;
class accessStack {
    
    
    public static void main(String[] args) {
       

       Stack<String> s1=new Stack<>();// can only hold string 

       s1.push("hello");
       s1.push("bob");
       System.out.println(s1);
       for (String s:s1)
       {
        System.out.println(s);

       }

       //or 
       for(int i=0;i<s1.size();i++)
       {
        System.out.println(s1.get(i));
       }
            

      

    }
}
