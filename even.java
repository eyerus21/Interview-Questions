/*An Evens number is an integer whose digits are all even. For example 2426 is an Evens number
but 3224 is not. */

import java.util.Scanner;

public class even{

static int isevens(int n) {
while(n!=0){ 
    
int x = n%10;
if(x%2!=0)
   return 0;
n = n/10;
}
   return 1;
}


public static void main(String[] args){
    Scanner myNum = new Scanner(System.in);
    System.out.println("Enter  a num:");
    int x= myNum.nextInt();
    System.out.println(isevens(x));

    }    




}