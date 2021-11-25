/*An array is called balanced if its even numbered elements (a[0], a[2], etc.) are even and its odd
numbered elements (a[1], a[3], etc.) are odd.
Write a function named isBalanced that accepts an array of integers and returns 1 if the array is
balanced, otherwise it returns 0.*/

import java.util.Scanner;

public class balanced_array {

    static int isBalanced(int[] num){

        for (int i = 0; i < num.length; i++){
            if(i%2==0 && num[i]%2!=0 )
                return 0;
            
            if (i%2!=0 && num[i]%2 ==0)   
                return 0;

        }
        
        return 1;
  }

   public static void main(String[] args){
    Scanner array= new Scanner(System.in);
    System.out.println("Enter size of the array:");
    int num= array.nextInt();
    int[]arr=new int[num];
    System.out.println("Enter elements of the array:");
    for(int i = 0; i < num; i++){
        arr[i]=array.nextInt();
    }
   
    System.out.println(isBalanced(arr));

   }

}
