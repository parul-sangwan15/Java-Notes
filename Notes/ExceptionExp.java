package Notes;

/* Can have my own defined exeption which inherits all the 
features from Exception parent class*/

class MyException extends Exception{
    public  MyException(String str){
        super(str);     // Calling constructor from super/parent class 

    }
}

class ThrowsExp{

    public void show() throws Exception{
        
        /* Either handle the exception here or mention
         * that this method 'throws' exception and handle where the
         * method is called.
         */
       /* try{
        System.out.println("I am handled!");
        }
        catch (Exception e){
            System.out.println("I am not handled!");
        }   */

        System.out.println("I am handled!");
    }

}

public class ExceptionExp {
    public static void  main(String[] args){

        int i = 3; 
        int j = 0;
        try{
        j = 20/i;
        if(j != 0){
            //throw new ArithmeticException();     // To handle exception without stopping the application
            throw new MyException("This is a custom exception!");
        }
        }
        catch(MyException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("Can not devide by zero\n" + e); 
            // will print  not divisible and would not execute try block
            // therefore, will be printed as 10.
        }
        catch(RuntimeException e){
            System.out.println("Errors encountered");
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println(j);    //Exception in thread "main" java.lang.ArithmeticException: / by zero


        /* Exception handled here
        Ducking Exception
        */ 


        ThrowsExp obj = new ThrowsExp();
        try{
            obj.show();
        } catch (Exception e){
            System.out.println("I am finally handled here:)");
        }
    }

}
