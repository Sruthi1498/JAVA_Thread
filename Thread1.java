public class Thread1 extends Thread{
    synchronized public void print(int n )
    {
        for(int i = 0;i<n;i++)
        {
            System.out.println(n*i);
        }
        try {
            Thread.sleep(4000);
        }
        catch (Exception e )
        {
            System.out.println("exception");
        }
    }
}
