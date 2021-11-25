/*  A Nice array is defined to be an array where for every value n in the array, there is also an element n-1 or
n+1 in the array.
For example, {2, 10, 9, 3} is a Nice array because
2 = 3-1
10 = 9+1
3 = 2 + 1
9 = 10 -1
Other Nice arrays include {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}. 
Write a function named isNice that returns 1 if its array argument is a Nice array. Otherwise it returns a 0.*/
import java.util.Scanner;
public class Nice_array {
    static int isNiceArray(int[] a){
        for(int i=0;i<a.length; i++){
            boolean flag = false;
        for(int j=0;j<a.length;j++){
            if(a[j]==a[i]-1 || a[j]== a[i]+1)
                flag= true;
              
        }  
        if(!flag)
            return 0; 
        }
        return 1;
}
    public static void main(String[] args){
        Scanner arr = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created::");
        int size = arr.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array ::");
        for(int i=0; i<size; i++) {
            myArray[i] = arr.nextInt();
         }

        //magicArray array = new magicArray(); 
        System.out.println(isNiceArray(myArray));
}
    
}
