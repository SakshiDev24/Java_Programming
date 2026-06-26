import java.util.*;

class DivisionExceptionFinally
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int no1 = 0, no2 = 0, Ans = 0;

        System.out.println("enter first number : ");
        no1 = sobj.nextInt();

        System.out.println("enter second number : ");
        no2 = sobj.nextInt();

        try
        {
            System.out.println("inside try block");
            Ans = no1 / no2;
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("inside catch block");
            System.out.println("exception occured : "+aobj);
        }
        catch(Exception eobj)
        {
            System.out.println("inside generic catch : "+eobj);

        }
        finally
        {
            System.out.println("inside finally block");
            sobj = null; //resource deallocation

        }

        System.out.println("division is : "+Ans);


    }

}