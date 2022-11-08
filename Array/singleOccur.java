//Time Complexity: O(n)
//Auxiliary Space: O(1)

//XOR of all array elements gives us the number with a single occurrence. The idea is based on the following two facts. 

 //XOR of a number with itself is 0. 
//XOR of a number with 0 is number itself.

/*
Input:  ar[] = {7, 3, 5, 4, 5, 3, 4}
Output: 7 

res = 7 ^ 3 ^ 5 ^ 4 ^ 5 ^ 3 ^ 4

Since XOR is associative and commutative, above 
expression can be written as:
res = 7 ^ (3 ^ 3) ^ (4 ^ 4) ^ (5 ^ 5)  
    = 7 ^ 0 ^ 0 ^ 0
    = 7 ^ 0
    = 7 
*/

class single_Occur {
    static int findD(int ar[],int n)
    {
       
        int res=ar[0];
         for (int i=1;i<n;i++)
         {
             res=res^ar[i];
         }
         return res;
    }
    public static void main(String[] args) {
        
        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        int n = ar.length;
        System.out.println("Element occurring once is " +
                            findSingle(ar, n) + " ");
    }
}
