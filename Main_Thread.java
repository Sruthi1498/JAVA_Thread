public class Main_Thread {
    public static void main(String[] args) {
        Thread1 obj = new Thread1();
        Thread2 ob1 = new Thread2(obj);
        Thread3 ob2 = new Thread3(obj);
        ob1.start();
        ob2.start();
    }
}
