package notes;

import java.io.BufferedReader; // Class imported
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;

public class InputExp {
    public static void main(String[] args) {
    

        System.out.println("Enter your input: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(in);  // BufferedReader requires an object of ImputStreamReader class

        try{
            int num = Integer.parseInt(bfr.readLine());
        System.out.println(num);
        bfr.close();
        }
        catch(IOException e){
            System.out.println(e);
        }

        /* But bufferedReader is a resource 
         * so you should utilise it and clear it after its usage : Line 19
         * Avoid data leaking
         * Also, can declare the object in try(''), it is autocloseable for some classes. : Line 16
         
         * This is called "Try with Resources"
         */

         /* Can also use Scanner 

         System.out.println("Enter a number: ");
         Scanner sc = new Scanner(System.in);
         int num1 = sc.nextInt();
         System.out.println(num1);
         sc.close();



         You can use finally{} block to execute something irrespective of an exception
         Mostly used whenever you want to close a resource.

         try{
           }
         catch{
         }
         finally{
         
         }
         */



    }
}
