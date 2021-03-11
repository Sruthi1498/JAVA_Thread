public class Thread3 extends Thread{

        Thread1 t;
        Thread3(Thread1 t)
        {
            this.t = t;
        }
        public void run()
        {
            t.print(10);
        }
    }


