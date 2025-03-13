package notes;


/*  enumeration is a special data type which 
is used to define a set of constant values */
enum Status{
    // Running, Starting, Stopping, Error, Pending;  // named constants



    Running(200), Starting(202), Stopping(300), Error(400), Pending(500);

/* Gives error: The constructor Status(int) is undefined 
     * Because these are calls to constructor Status(int)
    */

    /* Let's define the constructor */

    private int code = 0;
    private Status(int code) {
        this.code = code;

    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    

}


public class EnumExample {
    public static void main(String[] args) {
        
        //Status s = Status.Running;
        // System.out.println(s);
       // System.out.println(s.ordinal());      // prints the  associated integer value of the named constant



/* To print all the enum constants */
    //    Status s[] = Status.values();

    //    for(Status a : s){
    //     System.out.println(a);
    //     System.out.println(a.ordinal());
    //    }



    /* Enums with Switch */
    /*Status s = Status.Error;
    switch(s)
    {
        case Running:
        System.out.println("It is running");
        break;
        case Starting:
        System.out.println("It is starting");
        break;
        case Stopping:
        System.out.println("It is stopping");
        break;
        case Error:
        System.out.println("Error encountered");
        break;
        case Pending:
        System.out.println("It is pending");
        break;
        // default:
        // System.out.println("No process running");   // No default for enum

    }*/

    Status s = Status.Error;
    System.out.println(s);
    System.out.println(s.getCode());
       

    }
}
