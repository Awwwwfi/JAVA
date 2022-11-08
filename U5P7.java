//Unit 05 : Program 07
//Create 2 Thread type classes implement Runnable interface on one 
//and extend Thread class on other one and those threads should 
//print 1 to 10 on the console window and run those threads from 
//another class having main function.
public class U5P7 {
    public static void main(String[] args) {
        Thread threadObj1 = new Thread(new MyThread1());
        threadObj1.start();
        MyThread2 threadObj2 = new MyThread2();
        threadObj2.start();
    }
}

class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread 1 is running...");
        for(int i=1;i<=10;i++){
            System.out.println("Thread 1 count : "+i);
        }        
    }
}

class MyThread2 extends Thread{
    public void run() {
        System.out.println("thread 2 is running...");
        for(int i=1;i<=10;i++){
            System.out.println("Thread 2 count : "+i);
        }
    }    
}