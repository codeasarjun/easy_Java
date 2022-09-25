//passing array to the function 


class passingarray_Method {
    public static void main(String[] args) {
    char arr[]={'a','b','c'};//creating and filling the value
    printARR(arr); //passing the value to printARR function
    }
    static void printARR(char a[])
    {
        for (char c : a)
        {
            System.out.print(c);
        }
    }
}
