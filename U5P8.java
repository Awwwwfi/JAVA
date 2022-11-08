//Unit 05 : Program 08
//Create an example to demonstrate 2 Synchronised Thread. 
//Each thread should have a loop to print a message "Thread 1" and "Thread 2" and 
//thread 1 should sleep for 500 ms and 
//thread 2 should sleep for 300 ms after each loop execution.

public class U5P8 {
    public static void main(String args[]) {
        ThreadNamePrinter obj = new ThreadNamePrinter();// only one objectt
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}

class ThreadNamePrinter {
    synchronized void display(String thName, int delay) {// method not synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println(thName+" : "+ i);
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

class MyThread1 extends Thread {
    ThreadNamePrinter tnr;

    MyThread1(ThreadNamePrinter tnr) {
        this.tnr = tnr;
    }

    public void run() {
        tnr.display("Thread 1", 500);
    }

}

class MyThread2 extends Thread {
    ThreadNamePrinter tnr;

    MyThread2(ThreadNamePrinter tnr) {
        this.tnr = tnr;
    }

    public void run() {
        tnr.display("Thread 2", 300);
    }
}

