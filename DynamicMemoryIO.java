import java.util.Scanner;

class DynamicMemoryIO
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Size = 0;
        int i = 0;  //used for loop counter

        System.out.println("enter number of elements : ");
        Size = sobj.nextInt();

        //Dynamic memory allocation
        float marks[] = new float[Size];

        //use the memory
        System.out.println("enter your marks : ");

        for(i = 0; i < Size; i++)
        {
            marks[i] = sobj.nextFloat();
        }

        System.out.println("entered marks are : ");
        for(i = 0; i < Size; i++)
        {
            System.out.println(marks[i]);
        }


        marks = null;
        System.gc();
        
    }
}