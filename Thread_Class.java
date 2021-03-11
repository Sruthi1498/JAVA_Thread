public class Thread_Class extends Thread{
    public void run()
    {
        System.out.println("thread running");
    }

    public static void main(String[] args) {
        Thread_Class t = new Thread_Class();
        t.start();
    }
}
