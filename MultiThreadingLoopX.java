class Demo extends Thread
{
    public void run()
    {
        int i = 0;

        for(i = 1; i <= 100; i++)
        {
            System.out.println("inside run method of:"+Thread.currentThread().getName()+" : "+i);

        }
        
    }
}

class MultiThreadingLoopX
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

        System.out.println("end of main thread");
        
    }
}