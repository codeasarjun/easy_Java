// set bit is number of 1's in bit 

/*
Input : n = 6
Output : 2
Binary representation of 6 is 110 and has 2 set bits

Time Complexity: O(logn) 

Auxiliary Space: O(1)

*/

class count_set_bit {
    
    static int setBit(int x)
    {
        int count=0;
        while(x>0)
        {
            count+=x&1;
            x>>=1;
        }
        return count;
    }
    public static void main(String[] args) {
       System.out.print(setBit(6));
    }
}
