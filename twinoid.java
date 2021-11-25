/* A twinoid is defined to be an array that has exactly two even values that are adjacent to one another. For example {3, 3,
2, 6, 7} is a twinoid array because it has exactly two even values (2 and 6) and they are adjacent to one another. The
following arrays are not twinoid arrays.*/

import java.util.Scanner;

public class twinoid {
    
    static int istwinoid(int[] arr){
        int counteven=0;
    for(int i=0; i<arr.length; i++){    
        if(counteven==0){
            if(arr[i]%2==0){
                if(arr[i+1]%2!=0)
                    return 0;

                counteven=1;
            }}

        else 
            {if(arr[i]%2==0)
            return 0; }}
        return 1;
}
public static void main(String[] args){
    Scanner array= new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size= array.nextInt();
    int []arr= new int[size];
    System.out.println("Please enter the elements of the array");
    for(int i=0; i< size;i++){
        arr[i]= array.nextInt();
    }
System.out.println(istwinoid(arr));
}
}
