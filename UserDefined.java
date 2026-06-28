import java.util.*;

class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
        super(str);
    }

}
class UserDefined
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("enter your age : ");
        int Age = sobj.nextInt();

        try
        {
            if (Age < 18)
            {
                throw new AgeInvalid("you are under age");

            }
            else
            {
                System.out.println("you can attend session");
            }

        }
        catch(AgeInvalid aobj)
        {
            System.out.println("inside catch: "+aobj);
        }
    
    }

}