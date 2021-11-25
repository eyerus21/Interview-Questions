/*An integer is defined to be “continuous factored” if it can be expressed as the product of two or
more continuous integers greater than 1.
Examples of “continuous factored” integers are:
6 = 2 * 3.
60 = 3 * 4 * 5
120 = 4 * 5 * 6
90 = 9*10
Examples of integers that are NOT “continuous factored” are: 99 = 9*11, 121=11*11, 2=2, 13=13*/

import java.util.Scanner;
public class Continous_factored {
    
    static int isContinous_factored(int n){

        for(int i=2; i<n; i++){
            if(n%i==0){
            int product = i;
            for(int j=i+1; j<n; j++){
            if(n%j!=0){
            break;
            }
            else{
            product*=j;
            if(product==n)
            return 1;
            } } } }
            return 0;

    }

public static void main(String[] args){
    Scanner num= new Scanner(System.in);
    System.out.println("Enter a number");
    int number= num.nextInt();
    System.out.println(isContinous_factored(number));

    
}



}
