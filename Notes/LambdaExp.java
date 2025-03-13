package notes;

/* Funtional interface
 * just one abstract method declared
 * also caleed SAM Single abstract method
 */
@FunctionalInterface
interface A {

    int show(int i, int j);

    
}

/* Instead of this class we can use an anonymous inner class */

/*class Child implements A{
    public void show(){
        System.out.println("Hey");
    }
} */


public class LambdaExp {
    public static void main(String[] args) {
        /*A obj = new A()
        {
            public void show(){
                System.out.println("Hey");
            }
    };   // this is anonymous inner class
    obj.show();
    */



    /* To simplify this we use lambda expression (->) */

    A obj = (i,j) -> { int result;
        result = i + j;
        return result;
    };

    // OR
    // A obj = (i,j) -> i+j;

    System.out.println(obj.show(5,4));
}
}

   