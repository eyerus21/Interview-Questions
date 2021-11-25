/* An array is defined to be a Magic array if the sum of the primes in the array is equal to the first
element of the array. If there are no primes in the array, the first element must be 0. So {21, 3, 7, 9,
11 4, 6} is a Magic array because 3, 7, 11 are the primes in the array and they sum to 21 which is the
first element of the array. {13, 4, 4, 4, 4} is also a Magic array because the sum of the primes is 13
which is also the first element. Other Magic arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}. {0} is not a
Magic array because the sum of the primes is 5+5+3 = 13. Note that -5 is not a prime because prime
numbers are positive.*/

import java.util.Scanner;

public class magicArray {


    static int isMagicArray(int[]a){

        int sum=0;
        if(a[0]==0)
            return 1;
        for(int i=0; i< a.length; i++){
            int count=0;
        for(int j=2; j<a[i];j++){

            if(a[i]%j==0)
                count++; 
                //count the number of non-prime numbers
        }

            if(count==0 && a[i]>0)
                sum+=a[i];
            }
        
                if(sum==a[0])
                    return 1;
                return 0;
            
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
        System.out.println(isMagicArray(myArray));


    }
    
}
