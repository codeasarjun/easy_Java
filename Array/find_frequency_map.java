//finding the frequency of each element of array_ using Map
/*
Time Complexity : O(n) 
Auxiliary Space : O(n)
find_frequency_map
*/




import java.util.*;
public class find_frequency_map
{
	public static void main(String[] args) {
		int arr[]={1,1,2,3,2,1};
		int l=arr.length;
		HashMap<Integer, Integer> m
            = new HashMap<>();
        
        for (int i=0;i<l;i++)
        {
            if (m.containsKey(arr[i]))
            {
                m.put(arr[i], m.get(arr[i]) + 1); // .get value find values and then increase it with 1
            }
            else {
 
                // if value is not present in the map m then just putting it with occurance 1
                m.put(arr[i], 1);
            }
        }
        for (Map.Entry entry : m.entrySet()) { // this will unzip the value of m
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
            
		
	}
