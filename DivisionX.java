import java.util.*;

class DivisionX
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int no1 = 0, no2 = 0, Ans = 0;

        System.out.println("enter first number : ");
        no1 = sobj.nextInt();

        System.out.println("enter second number : ");
        no2 = sobj.nextInt();

        Ans = no1 / no2;

        System.out.println("division is : "+Ans);


    }

}