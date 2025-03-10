package Notes;

public class ExceptionExp {
    public static void  main(String[] args){

        int i = 0; 
        int j = 10;
        try{
        j= j/i;

        }
        catch(Exception e){

            System.out.println("Not divisible\n" + e); 
            // will print  not divisible and would not execute try block
            // therefore, will be printed as 10.
        }

        System.out.println(j);    //Exception in thread "main" java.lang.ArithmeticException: / by zero
    }

}
