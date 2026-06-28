import java.util.*;

class ArrayIndexException
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {11,21,51,101,111};

        System.out.println("enter the index of Array : ");
        int Index = sobj.nextInt();

        try
        {
            System.out.println("inside try block");
            System.out.println("element at that index is : "+Arr[Index]);
        }
        catch(ArrayIndexOutOfBoundsException aobj)
        {
            System.out.println("exception occured : "+aobj);
        }

        System.out.println("end of application");

    }

}