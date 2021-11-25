/*
An array is defined to be complete if the conditions (a), (d) 
and (e) below hold.
a. The array contains even numbers
b. Let min be the smallest even number in the array.
c. Let max be the largest even number in the array.
d. min does not equal max
e. All numbers between min and max are in the array
*/

import java.util.Scanner;

public class complete_array {


public int isComplete(int[] a){
    int max=0;
    int min=0; 
    int counteven =0;

    for(int j=0; j<a.length; j++){
        if(a[j]%2==0){
        min = a[j];
        max = a[j];
        break;
        }}

    for (int i=0; i<a.length; i++){
        if(a[i]%2==0){
            counteven++;
            if (max < a[i])
                max = a[i];
            if(min >a[i])
                min = a[i];
                    }
                                 }
    int x= (max-min)-1;
    int y= min+1;
    int count=0;

    for (int m=0; m< a.length;m++){

        if(y== a[m] && y<max){
            count++;
            y++;
            m=-1;
        }

        

    }

if(count == x)
        return 1;
    return 0;

}

public static void main(String[] args) {
    Scanner arr= new Scanner(System.in);
    System.out.println("please enter size of the array");
    int size = arr.nextInt();
    int[] myArray= new int[size];
    System.out.println("Enter the elements of the array ::");
    
    for (int i=0; i < size;i++ ){
        myArray[i]=arr.nextInt();
    }
    complete_array array= new complete_array();
    System.out.println(array.isComplete(myArray));


}

    
}