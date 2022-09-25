// In this program will try to learn how to create array for the object 
// Time Complexity: O(n) 
//Auxiliary Space : O(1)


class Student
{
     public int roll_no;
     public String name;
    Student(int r, String st_name)
    {
        this.roll_no=r; // this is for the current ref
        this.name=st_name;
    }
    
}
public class arrayOFobjects
{
	public static void main(String[] args) {
	    
	    Student list []=new Student[2]; // creating array of Object
	    
	    list[0]=new Student(123,"krishna");
	    list[1]=new Student(12,"Ravi");
	    
	    for (int i=0;i<list.length;i++)
	    {
	        System.out.println("Studnet at index "+i+list[i].roll_no+" "+list[i].name);
	        // list[i].var_name can be used to access intems in the class
	    }
		
	}
}
