import java.util.Scanner;

class DynamicMemory
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Size = 0;

        System.out.println("enter number of elements : ");
        Size = sobj.nextInt();

        //Dynamic memory allocation
        float marks[] = new float[Size];

        //use the memory

        marks = null;
        System.gc();
        
    }
}