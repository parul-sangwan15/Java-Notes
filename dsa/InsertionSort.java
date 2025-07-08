package dsa;

public class InsertionSort{

    public static void main(String[] args){
   int arr[] = {4, 6, 3, 2, 10, 7};

   quickSort(arr, 0, arr.length-1)
   

   
    }
}



/*  Insertion Sort
 * for(int i =1; i < size; i++){
    
    int key = num[i];
    int j = i-1;
        while( j >= 0 && num[j] > key){
            num[j+1] = num [j];
            j--;
        }
        num[j+1] = key;
     }
     
     for(int arr:num){
        System.out.print(arr + " ");
     }
 */
