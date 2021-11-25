/*An array is said to be hollow if it contains 3 or more zeroes in the middle that are preceded and
followed by the same number of non-zero elements. Write a function named isHollow that accepts an
integer array and returns 1 if it is a hollow array, otherwise it returns 0 */

import java.util.Scanner;


public class hollow_array {

    static int ishallow(int[] arr){
        int zerocount=0;
        int non_zeroCount=0;
        int endCount=0;
        int startCount=0;
        if (arr[0] == 0 || arr[arr.length- 1] == 0) 
            return 0;
        for(int i=0; i< arr.length;i++){
            if(arr[i]!=0)
                startCount++;
            else 
                break;

        }
        for(int i=0; i< arr.length;i++){
            if(arr[i]==0)
                zerocount++;
            else if(arr[i]!=0)
                non_zeroCount++;


        }
        for(int i= arr.length-1; i>=0; i--){
            if(arr[i]!=0){
                endCount++;
            }
            else {
                break;
            }
        }
        if (startCount == endCount && (startCount + endCount) == non_zeroCount && zerocount >= 3) {
            return 1;
        }
        return 0;
     }
    public static void main(String[] args){

        Scanner array= new Scanner(System.in);
        System.out.println("enter size of the array");
        int size = array.nextInt();
        int[] arr= new int[size];
        System.out.println("enter elements of the array");
        for(int i=0; i<size;i++){
            arr[i]= array.nextInt();
}
        System.out.println(ishallow(arr));

    }
}
