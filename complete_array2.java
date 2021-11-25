/* An array is defined to be complete if all its elements are greater than 0 and all even numbers that
are less than the maximum even number are in the array.
For example {2, 3, 2, 4, 11, 6, 10, 9, 8} is complete because
a. all its elements are greater than 0
b. the maximum even integer is 10
c. all even numbers that are less than 10 (2, 4, 6, 8) are in the array.
But {2, 3, 3, 6} is not complete because the even number 4 is missing. {2, -3, 4, 3, 6} is not complete
because it contains a negative number. */

import java.util.Scanner;
public class complete_array2 {

    static int iscomplete2(int []arr){

        int max=0;
        for (int i=0; i< arr.length; i++){
            if(arr[i]<=0)
            return 0;
        if(arr[i]>max && arr[i]%2==0)
            max= arr[i];
        }
        max-=2;
        boolean found= true;
       
            while(max>0 && found){
                found= false;
                for(int i=0; i<arr.length;i++){
                    if(arr[i]==max)
                        found=true;
            }
            max-=2;
        }
            if(found)
                return 1;
        return 0;         



    }
    public static void main(String[] args){
        Scanner array= new Scanner(System.in);
        System.out.println("enter size of the array");
        int size= array.nextInt();
        int [] arr= new int[size];
        System.out.println("enter the elements of the array");
        for(int i=0;i<size; i++){
            arr[i]=array.nextInt();

        }
        System.out.println(iscomplete2(arr));
    }
    
}
