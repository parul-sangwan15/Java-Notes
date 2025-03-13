package notes;

//To make it a thread class, inherit Thread class
class A extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++){
        System.out.println("Hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}

/* You can put a thread to sleep before further executing */
class B extends Thread{
    public void run(){
        for(int i = 0; i < 50; i++){
        System.out.println("Hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}

public class ThreadExp {

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // obj1.show();
        // obj2.show();

        /* We can set the priority of the thread using setpriority methof of thread class */
        obj1.setPriority(Thread.MAX_PRIORITY);
        // Thread class starts execution by using the start method
        /* You can put a thread to sleep before further calls for better optimization*/


        obj1.start();
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();

        // but this start() method uses the run to be executd, so you must have a run() in your thread classes
    }
    
}
