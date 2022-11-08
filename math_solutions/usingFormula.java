//Time Complexity: O(logn), this is because calculating phi^n takes logn time
//Space Complexity: O(1)

import java.util.*;
class usingFormula {
    public static void main(String[] args) {
        
        int n=5;
        int nth;
        double p,c;
        p=(1+Math.sqrt(5))/2;
        c=Math.pow(p,n);
        nth=(int) Math.round(c/(Math.sqrt(5)));
        
        System.out.println(nth);
    }
}
