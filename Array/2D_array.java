// in this example will try to understand 2D array creation 

//Time Complexity: O(nxn)

//Auxiliary Space : O(1)

public class Main
{
	public static void main(String[] args) {
		
		int _arr[][]=new int [2][2];// can be declare 
		_arr[0][0]=1; // provding value for the location [0][0]
		System.out.print(_arr[0][0]);
		System.out.println();
		int arr[][]
            = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
            
            for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
  
            System.out.println();
        }
		
	}
}


