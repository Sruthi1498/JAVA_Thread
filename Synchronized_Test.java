public class Synchronized_Test {
    public static void main(String[] args) {
        final Thread1 obj = new Thread1();

        Thread t1 = new Thread(){
            public void run(){
               obj.print(90);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                obj.print(100);
            }
        };
        t1.start();
        t2.start();
    }
}
