public class Runnable_Interface implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread");
    }

    public static void main(String[] args) {
        Runnable_Interface r = new Runnable_Interface();
        Thread t = new Thread(r);
        t.start();
    }
}
