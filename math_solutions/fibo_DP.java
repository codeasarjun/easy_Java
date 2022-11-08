
// O(n)


class fibo_DP {
    
    static int fib(int n)
    {
        
        int dp[]=new int[n+2];// extra to handle the case n=0
        dp[0]=0;
        dp[1]=0;
        
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        
    }
    public static void main(String[] args) {
        int n=5;
        
        System.out.println(fib(n));
    }
}
