import java.io.*;
import java.net.*;

class ChatServer
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("server application is running");

        ServerSocket ssobj = new ServerSocket(2100);

        System.out.println("server is waiting at port 2100");

        Socket sobj = ssobj.accept();

        System.out.println("client request gets accepted successfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader( new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("____________________________________");

        System.out.println("_______Marvellous chat server_______");

        System.out.println("____________________________________");

        String str1 = null, str2 = null;

        while((str1 = bobj1.readLine()) != null)
        {
            System.out.println("client says :"+str1);
            System.out.println("enter msg for client :");
            str2 = bobj2.readLine();
            pobj.println(str2);
        }

        sobj.close();
        ssobj.close();
    }
}