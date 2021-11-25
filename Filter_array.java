/* An array is defined to be a Filter array if it meets the following conditions
a. If it contains 9 then it also contains 11.
b. If it contains 7 then it does not contain 13.
So {1, 2, 3, 9, 6, 11} and {3, 4, 6, 7, 14, 16}, {1, 2, 3, 4, 10, 11, 13} and {3, 6, 5, 5, 13, 6, 13} are Filter
arrays. The following arrays are not Filter arrays: {9, 6, 18} (contains 9 but no 11), {4, 7, 13} (contains
both 7 and 13)
Write a function named isFilter that returns 1 if its array argument is a Filter array, otherwise it returns
0.*/
import java.util.Scanner;
public class Filter_array{

    static int isFilter(int[] a) {

        boolean flag= false, nine= false, eleven=false;
        for(int i=0; i<a.length; i++){
        if(a[i]==9)
            nine=true;
        
        else if(a[i]==11)
           eleven=true ;
        }
        if(nine && eleven)
            flag=true;
        else if(!nine && !eleven)
            flag=true;

        boolean seven = false, thirteen = false;
        for(int i=0; i<a.length; i++){
            if(a[i]==7){
               seven = true;
        }
            else if(a[i]==13){
               thirteen = true;
            }
       }
       if(flag && !thirteen && seven)
            return 1;
        else if(flag && !seven && thirteen )   
            return 1;  
       else 
          return 0;
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
           
            System.out.println(isFilter(arr));
        
           }




}