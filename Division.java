import java.util.*;

class Division
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float no1 = 0.0f, no2 = 0.0f, Ans = 0.0f;

        System.out.println("enter first number : ");
        no1 = sobj.nextFloat();

        System.out.println("enter second number : ");
        no2 = sobj.nextInt();

        Ans = no1 / no2;

        System.out.println("division is : "+Ans);


    }

}