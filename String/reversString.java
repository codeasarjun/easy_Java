
/*


Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i


*/

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        int i=S.length()-1;
        String temp="";
        String res="";
        while(i>=0)
        {
            if (S.charAt(i)=='.')
            {
                res=res+temp+".";
                temp="";
            }
            else
            {
                temp=S.charAt(i)+temp;
            }
            i--;
        }
        return (res+temp);
    }
}
