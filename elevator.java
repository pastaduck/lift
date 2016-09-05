
/**
 * Write a description of class elevator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class elevator
{
    // instance variables - replace the example below with your own
    private int current_floor;
    private int top_floor;
    /**
     * Constructor for objects of class elevator
     */
    public elevator()
    {
        // initialise instance variables
        current_floor = 0;
        top_floor = 11;
    }

    public void ascend()
    {
        if(current_floor < top_floor) 
        {
            current_floor = current_floor + 1;
        }   
        else    
        {
            System.out.println("Sorry you are at the top already");
        }
    }
}
