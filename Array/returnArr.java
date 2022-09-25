// returing an array from a method



class returnArr {
    public static void main(String[] args) {
    char arr[]={'a','b','c'};//creating and filling the value
    printARR(arr);
    int a=findL(arr); // gettign the return value 
    System.out.print("size of array is "+a);
    }
    static void printARR(char a[])
    {
        for (char c : a)
        {
            System.out.print(c);
        }
    }
    static int findL(char a[])
    {
        int s=a.length;
        return s; # returning the length of arr
    }
}
