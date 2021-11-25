/*A wave array is defined to an array which does not contain two even numbers or two odd
numbers in adjacent locations. So {7, 2, 9, 10, 5}, {4, 11, 12, 1, 6}, {1, 0, 5} and {2} are all wave
arrays. But {2, 6, 3, 4} is not a wave array because the even numbers 2 and 6 are adjacent to each
other.
Write a function named isWave that returns 1 if its array argument is a Wave array, otherwise it
returns 0. */

import java.util.Scanner;
public class Wave_array {

    static int isWave_array(int[] a) {
        for(int i=0; i<a.length-1; i++){
            if(a[i]%2==0 && a[i+1]%2==0)
            return 0;
            if(a[i]%2!=0 && a[i+1]%2!=0)
            return 0;
            }
        return 1;
        }
        public static void main(String[] args) {

            Scanner array= new Scanner(System.in);
            System.out.println("enter size of the array");
            int size = array.nextInt();
            int[] arr= new int[size];
            System.out.println("enter elements of the array");
            for(int i=0; i<size;i++){
                arr[i]= array.nextInt();

    }
            System.out.println(isWave_array(arr));
}

}

    

