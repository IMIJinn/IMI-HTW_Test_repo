
/**
 * Here are some things to fix.
 *
 * @author  n-c0de-r
 * @version 23.02.16
 */
public class Pet
{
    private String type = "";
    private String name = "";
    private byte age = 0;
    private String name2 = "";
    private byte age2 = 0;
    private String address = "";

    public void behaveAnimalistic(String choice)
    {
        if(choice.equals("eat")) {
            System.out.println("The animal eats.");
        }
        if(choice.equals("play")) {
            System.out.println("The animal plays.");
        }
        if(choice.equals("sound")) {
            System.out.println("The animal makes sounds.");
        }
        if(choice.equals("sleep")) {
            System.out.println("The animal sleeps.");
        }
    }
    
    public void specialMethod(String t, byte a, String n, String i, byte num, String u)
    {
        // Checks if the type of animal is a dog, if the name of the owner starts
        // with the given initial or n or N and the animal is younger than 18
        // as well as the owner. Also if the owners age is half of the owner or same
        // then greet the current user as a guest.
        if((t.equals("Dog") || t.equals("dog")) && a < 18 && (n.startsWith(i) || n.startsWith("n") || n.startsWith("N")) && (num < 18 && (num/a == 2 || num/a == 0))) {
            System.out.println("Hello " + u + ". We welcome you as a guest!");
            
            if(a == num)
            {
                a = num;
                age = a;
                name = name2;
            }
        }
    }
    
    public void sound(String day)
    {
        if(day.equals("Saturday") || day.equals("Sunday"))
        {
            System.out.println("The animal makes sleeping sounds.");
        }
        else
        {
            System.out.println("The animal makes sounds.");
        }
    }
}
