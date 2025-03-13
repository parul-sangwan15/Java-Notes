package notes;

/*  Because we cannot inherit multiple classes in java, when you want to inherit a class but also make the
 * subclass a thread, used Runnable interface
 * 
 * Runnable have abstract run method
*/
class A implements Runnable{
    public void run(){
        for(int i = 0; i < 10; i++){
        System.out.println("Hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i = 0; i < 10; i++){
        System.out.println("Hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}

public class RunnableExp {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();


        /* Now, the runnable interface does not have the methods of
         * Thread class,like the start() method, so we have to create 
         * instance of Thread class to execute start method
         */
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        
        t2.start();

        /*But now these t1 and t2 have no idea what to start
         * therefore, we can create objects of class A and B
         * and assign them to reference variables of Type Runnable
         */

        
    }
    
}

