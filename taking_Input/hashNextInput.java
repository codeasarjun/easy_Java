//we have to check if the next value we read is of a certain type or if the input has ended (EOF marker encountered).
//hasNextInt() for int 
//hasNext() for string 
//hasNext().charat(0)

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int sum=0;
        while(sc.hasNextInt())
        {
            int x=sc.nextInt();
            sum+=x;
            
        }
        
        System.out.println("Sum of number are "+sum);
    }
}
