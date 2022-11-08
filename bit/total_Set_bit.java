/*
Given a positive integer n, count the total number of set bits in binary representation of all numbers from 1 to n. 

Examples: 

Input: n = 3
Output:  4
Time Complexity: O(nLogn) 

*/

Class total_Set_bit{

    
    static int countSetBits( int n)
    {
       
        int bitCount = 0;
    
        for (int i = 1; i <= n; i++)
            bitCount += countSetBitsUtil(i);
    
        return bitCount;
    }
    
    
    static int countSetBitsUtil( int x)
    {
        if (x <= 0)
            return 0;
        return (x % 2 == 0 ? 0 : 1) + 
               countSetBitsUtil(x / 2);
    }

    public static void main(String[] args)
    {
        int n = 4;
        System.out.print("Total set bit count is ");
        System.out.print(countSetBits(n));
    }
}


