class Demo extends Thread
{
    public void run()
    {
        System.out.println("inside run method of:"+Thread.currentThread().getName());
    }
}

class MultiThreadingName
{
    public static void main(String A[])
    {
        System.out.println("main thread is running");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("first");
        dobj2.setName("second");

        dobj1.start();
        dobj2.start();
        
    }
}