


// input ={1, 2, 8, 3, 2}
/*output 
1 1
2 2
8 1
3 1
*/



public class find_frequency
{
	public static void main(String[] args) {
		int arr[]={1,1,2,3,2,1};
		int l=arr.length;
		int visited_arr []= new int[l];
		int visited=-1;
		for (int i=0;i<l;i++)
		{
		    int count=1;
		    for (int j=i+1;j<l;j++)
		    {
		        if (arr[i]==arr[j])
		        {
		            count++;
		             //To avoid counting same element again  
                     visited_arr[j]= visited;  
		        }
		    }
		    if (visited_arr[i]!=visited)
		    {
		        visited_arr[i]=count;
		    }
		    
		}
		
		for (int i=0;i<visited_arr.length;i++)
		{
		    if (visited_arr[i]!=visited)
		    {
		        System.out.println("    " + arr[i] + "    |    " + visited_arr[i]);
		    }
		}
		
	}
}
