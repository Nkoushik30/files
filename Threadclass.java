class a extends Thread {
    public void run() {
        int m=0;
        while (m<5) {
            System.out.println("Good morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            m++;
        }
    }
}

class b extends Thread {
    public void run() {
        int n=0;
        while (n<5) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            n++;
        }
    }
}

class c extends Thread {
    public void run() {
        int i=0;
        while (i<5) {
            System.out.println("Welcome");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            i++;
        }
    }
}

public class Threadclass {
    public static void main(String[] args) throws Exception {
        a t1 = new a();
        b t2 = new b();
        c t3 = new c();
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(t3.isAlive());
        t1.join();
        t2.join();
        t3.join();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(t3.isAlive());
    }
}