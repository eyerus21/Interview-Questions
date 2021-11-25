/*An array with an odd number of elements is said to be centered if all elements (except the middle
one) are strictly greater than the value of the middle element. Note that only arrays with an odd
number of elements have a middle element. Write a function named isCentered that accepts an
integer array and returns 1 if it is a centered array, otherwise it returns 0.*/

import java.util.Scanner;
public class Centered_array {
    static int isCompleted(int[] arr){
        if(arr.length<1 || arr.length %2 ==0)
            return 0;
        if(arr.length %2 !=0){
            for(int i=0; i<arr.length; i++){
                if(arr[arr.length/2]>=arr[i] && i!=arr.length/2)
                    return 0;
}
}
                    return 1;
    }
    public static void main(String[] args){

        Scanner array= new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size= array.nextInt();
        int[] arr= new int[size];
        System.out.println("enter elements of an array:");
        for(int i=0;i<size;i++){
            arr[i]= array.nextInt();
        }
        System.out.println(isCompleted(arr));


    }

    

}
