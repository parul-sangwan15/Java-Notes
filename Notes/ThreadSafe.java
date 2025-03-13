package notes;

/* For a shared variable, these threads will not work as expected
 * for example:
 * The count++ operation is not atomic (it consists of three steps: 
 * read, increment, and write). 
 * This means two threads can read the same value before either writes back, leading to missed updates.
 */

 class Counter{
    int count;         // shared variable between obj1 and obj2
    public synchronized void increment(){            // synchronized allows the execution of only one thread out or multiple
        count++;                                     // which are sharing a variable.
    }
 }

public class ThreadSafe {
    public static void main(String[] args) {
        Counter ct = new Counter();
        Runnable obj1 = () -> {
               for(int i = 1; i <= 2000; i++ ){             /* Anonymous inner class with Lambda expression */
                ct.increment();
               }  
        };

        Runnable obj2 = () -> { 
            for(int i = 1; i <= 2000; i++ ){
                ct.increment();
               }  
        };
        

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();             // Ensures both threads finish execution
        } catch (InterruptedException e) {          
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(ct.count);
    }

    /* race condition because multiple threads (t1 and t2) are modifying 
    the shared variable count without synchronization. This can lead to 
    unpredictable results due to thread interleaving. */
}
