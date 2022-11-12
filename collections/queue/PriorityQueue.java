import java.util.*;

class HelloWorld {
  
    
    public static void main(String[] args) {
       int arr[]={1,2,3,4,2};
       Queue <Integer> data=new PriorityQueue<>();
       for(int i:arr)
       {
        data.add(i);
       }

       System.out.println(data.element());// it prints top element and if top is not there then thorws an exception
       System.out.println(data.peek());//returns top of queue, if not then null

       //Interating the Queue 
       Iterator itr=data.iterator();
       while(itr.hasNext())
       {
        System.out.print(itr.next());
       }
       System.out.println("will see the remove part of queue");
       data.remove();// remove the top element and throw an exception if Q is empty 
       data.poll();//remove top of Q or return null if empty 
    }
}
