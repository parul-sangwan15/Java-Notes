package notes;

import java.util.*;
import java.util.TreeSet;

public class CollectionAPI {
    public static void main(String[] args){

/* works well for adding and fetching  */
        //Collection<Integer> nums = new ArrayList<Integer>();

        /* But for working with index use List 
         * Works for duplicate values but if need unique values use Set
        */

      //  List<Integer> nums = new ArrayList<Integer>();

    //   Set<Integer> nums = new HashSet<Integer>();   // no repeated values but unsorted

      // for sorted values use TreeSet instead of  HashSet

      Set<Integer> nums = new TreeSet<Integer>();
      

        /*These are object types because we haven't defined the collection type */
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(8);
        nums.add(9);


        System.out.println(nums);
        for(int n : nums){
            System.out.println(n);
        }

    }
}
