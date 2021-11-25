/*A primeproduct is a positive integer that is the product of exactly two primes greater than 1. For
example, 22 is primeproduct since 22 = 2 times 11 and both 2 and 11 are primes greater than 1.
Write a function named isPrimeProduct with an integer parameter that returns 1 if the parameter is a
primeproduct, otherwise it returns 0.*/

import java.util.Scanner;
public class primeproduct extends primenumber{

static int isPrimeProduct(int n){

    for(int i=2; i<n; i++){
        if(n%i==0 && isPrime(i)){
            for(int j=i+1; j<n; j++)
            if(n%j==0 && isPrime(j)){
            if(i*j==n)
            return 1;

}}
    }
    return 0;
}
public static void main(String[] args){

Scanner num= new Scanner(System.in);
System.out.println("Enter a number");
int number= num.nextInt();

if(isPrimeProduct(number)==1)
    System.out.println("The Number is primeproduct");
else{
    System.out.println("not prime");}

}
    
}
