/* A Bunker array is an array that contains the value 1 if and only if it contains a prime number. The array {7,
6, 10, 1} is a Bunker array because it contains a prime number (7) and also contains a 1. The array {7, 6, 10}
is not a Bunker array because it contains a prime number (7) but does not contain a 1. The array {6, 10, 1}
is not a Bunker array because it contains a 1 but does not contain a prime number.
It is okay if a Bunker array contains more than one value 1 and more than one prime, so the array {3, 7, 1, 8, 1}
is a Bunker array (3 and 7 are the primes). */
import java.util.Scanner;
public class Bunker_Array4 extends primenumber{

    static int isbunker4(int[] a){
        boolean one = false, flagP=false; 
        for(int i=0; i<a.length; i++){
            if(isPrime(a[i]))
                flagP=true;
            else if(a[i]==1)
                one = true;}
            if(flagP && one)
                return 1;
            else if(!flagP && !one)
                return 1;
            return 0;            
            }
        // for(int j=0; j<a.length; j++){
        // if(one && isPrime(a[j]) && a[j]!=1)
        // return 1;}
        // return 0;


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
        System.out.println(isbunker4(myArray));
}}
