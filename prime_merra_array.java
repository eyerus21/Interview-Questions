/* A Meera array is an array that contains the value 0 if and only if it contains a prime number. The
array {7, 6, 0, 10, 1} is a Meera array because it contains a prime number (7) and also contains a 0.
The array {6, 10, 1} is a Meera array because it contains no prime number and also contains no 0. 
Write a function named isMeera that returns 1 if its array argument is a Meera array and returns 0*/

import java.util.Scanner;
public class prime_merra_array extends primenumber {

    static int isMeera_primeArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            boolean zero =false; boolean prime=false;
            if(arr[i]==0)
                zero=true;
            if(isPrime(arr[i])&& arr[i]>1)
                prime= true;
            if(prime && zero)
                return 1;
            if(!prime && !zero)
                return 1;        
        }
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
        System.out.println(isMeera_primeArray(arr));

    }
}
