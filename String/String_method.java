class HelloWorld {
    
    
    public static void main(String[] args) {
        String s="Once upon a time @ google";
        int x=s.length(); // gives the length of String 
        System.out.println("len of string is :"+x);

        char c=s.charAt(2); // to find the char @ given index 
        System.out.println("char at index 2 is "+c);

        String sub_string=s.substring(0,5); // gives substring in a given index 0 to (5-1)
        System.out.println(sub_string);

        String sub_=s.substring(3);// print all the string from 3rd index to last
        System.out.println(sub_);

        String concatS=s.concat("Too good");// add a string in last of another
        System.out.println(concatS);

        int indexof=s.indexOf("Too");// return first occrance of string

        System.out.println(indexof);
        //int indexOf (String s, int i): Returns the index within the string of the first occurrence of the specified string, starting at the specified index.

        //Int lastIndexOf( String s): Returns the index within the string of the last occurrence of the specified string.
        String str = "Learn Share Learn";
        int output = s.lastIndexOf("a"); // returns 14

        boolean res="go".equals("go");// Compares this string to the specified object

        boolean res_="Go".equals("go");//Compares string to another string, ignoring case considerations.
        /*
         * int out = s1.compareTo(s2);  // where s1 ans s2 are
                             // strings to be compared

        This returns difference s1-s2. If :
        out < 0  // s1 comes before s2
        out = 0  // s1 and s2 are equal.
        out > 0   // s1 comes after s2.
         */

         int res__="a".compareTo("b");
         System.out.println(res__); // here res =-1 means a comes before b
        //int out = s1.compareToIgnoreCase(s2); 
        String txt="hello";
        txt.toUpperCase();// convert to upper case
        txt.toLowerCase();//convert to lower case
        String txt_=" i am ";
        txt.trim();//Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.

        txt.replace("h", "g");//Returns new string by replacing all occurrences of oldChar with newChar.
        






    }
}
