public class Thread_methods extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++) {
        System.out.println("thread");
        try {
            System.out.println("thread sleep");
            Thread_methods.sleep(1000);

            System.out.println("thread wake up");
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread_methods de = new Thread_methods();

        System.out.println(de.getState());
        //Runnable state de.start();
        System.out.println(de.getState());
        System.out.println(de.getState());
        System.out.println(de.getState());
        System.out.println("thread Name"+de.getName());
        System.out.println("thread Priority"+de.getPriority());
        System.out.println(de.getState());
    }
}


