class MainThreadPriority
{
    public static void main(String A[])
    {
        System.out.println("Inside Main method");

        Thread tobj = Thread.currentThread();
        String name = tobj.getName();

        System.out.println("name of current thread : "+name);

         System.out.println("priority of a thread is : "+tobj.getPriority());

    }
}