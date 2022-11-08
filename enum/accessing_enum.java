enum Color {
    RED,
    GREEN,
    BLUE;
}

public class accessing_enum {
    public static void main(String[] args)
    {
        
        Color arr[] = Color.values(); //// Calling values(), it call the available values in enum

       
        for (Color col : arr) {
            
           
            System.out.println(col + " at index "+ col.ordinal());//// Calling ordinal() to find index
        }

        // Using valueOf(). Returns an object of
        
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
    }
}
