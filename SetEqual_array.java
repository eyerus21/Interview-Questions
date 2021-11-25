/*Let us define two arrays as “set equal” if every element in one is also in the other and vice-versa.
For example, any two of the following are equal to one another: {1, 9, 12}, {12, 1, 9}, {9, 1, 12, 1}, {1,
9, 12, 9, 12, 1, 9}. Note that {1, 7, 8} is not set equal to {1, 7, 1} or {1, 7, 6}.
Write a function named isSetEqual(int[ ] a, int[ ] b) that returns 1 if its array arguments are set equal,
otherwise it returns 0.*/

import java.util.Scanner;
public class SetEqual_array {
   
    static int isequal_array(int[] arr, int[] arr2){

        if (arr.length == 0 && arr2.length == 0) return 1;
        else if (arr.length == 0 && arr2.length > 0) return 0;
        else if (arr.length > 0 && arr2.length == 0) return 0;

        int count=0;
        for(int i=0; i<arr.length; i++){
            for (int j=0; j< arr2.length;j++)
                if(arr[i]==arr2[j])
                    count++; 
                   
            }
            if(arr.length > arr2.length){
                if(count==arr.length)
                    return 1;}
            else if(arr.length<arr2.length){
                if(count==arr2.length)
                    return 1;   }
            else if(arr.length==arr2.length){
                if(count==arr2.length)
                    return 1;  }
         return 0;   
    }

    public static void main(String[] args){
        
        Scanner array = new Scanner(System.in);
        System.out.println("enter size of the array");
        int size= array.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements of the array");
        for (int i=0; i< size;i++){
            arr[i]= array.nextInt();
        }
        System.out.println("enter size of the array");
        int size2= array.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("enter elements of the array");
        for (int i=0; i< size2;i++){
            arr2[i]= array.nextInt();
        }
        System.out.println(isequal_array(arr,arr2));
    }
   
    
}


/* or

 for (int x: a) {
            boolean found = false;
            for (int y: b) {
                if (y == x) {
                    found = true; break;
                }
            }
            if (!found) return 0;
        }

        for (int x: b) {
            boolean found = false;
            for (int y: a) {
                if (y == x) {
                    found = true; break;
                }
            }
            if (!found) return 0;
        }

        return 1;
    }

*/