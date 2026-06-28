import java.io.*;

class BufferedIOX
{
    public static void main(String A[]) throws IOException
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter your name : ");
        String name = bobj.readLine();  //checked exception

        System.out.println("hello "+name);
    }
}