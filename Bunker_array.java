/* Bunker array is defined to be an array in which at least one odd number is immediately followed
by a prime number. So {4, 9, 6, 7, 3} is a Bunker array because the odd number 7 is immediately
followed by the prime number 3. But {4, 9, 6, 15, 21} is not a Bunker array because none of the odd
numbers are immediately followed by a prime number.
Write a function named isBunkerArray that returns 1 if its array argument is a Bunker array,
otherwise it returns 0.*/
import java.util.Scanner;
public class Bunker_array extends primenumber {

    static int isBunkerArray(int[] arr){

        for (int i=0; i< arr.length-1; i++){
            if (arr[i]%2==0 && isPrime(arr[i+1]))
                return 1;
}
    return 0;
}

    public static void main(String[] args){
        
        Scanner array = new Scanner(System.in);
        System.out.println("enter size of the array");
        int size= array.nextInt();
        int[] arr = new int[size];
        for (int i=0; i< size;i++){
            arr[i]= array.nextInt();
        }

        System.out.println(isBunkerArray(arr));
    }




    
}
