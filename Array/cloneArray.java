// 
// cloning of one-dimensional arrays

class Test {
	public static void main(String args[])
	{
		int arr[] = { 9,101,2};

		int c_arr[] = arr.clone();

		// will print false as deep copy is created
		// for one-dimensional array
		System.out.println(intArray == cloneArray);

		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i] + " ");
		}
	}
}
