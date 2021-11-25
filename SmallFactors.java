/*Given a positive integer k, another positive integer n is said to have k-small factors if n can be
written as a product u*v where u and v are both less than k. For instance, 20 has 10-small factors
since both 4 and 5 are less than 10 and 4*5 = 20. (For the same reason, it is also true to say that 20
has 6-small factors, 7-small factors, 8-small factors, etc). However, 22 does not have 10-small
factors since the only way to factor 22 is as 22 = 2 * 11, and 11 is not less than 10.
Write a function hasKSmallFactors with signatuare
boolean hasKSmallFactors(int k, int n)
which returns true if n has k-small factors. The function should return false if either k or n is not
positive.*/

import java.util.Scanner;

public class SmallFactors {

    static boolean hasKSmallFactors(int n, int k){
        if(n<0 || k < 0)
            return false;
        for(int i = 1; i<n;i++ ){
            if(n%i==0){
                for(int j=i+1; j<n; j++){
                    if(n%j==0){
                        if(i<k && j<k){
                            if(i*j==n)
                                return true;
                        }
                    }
                    else break;
                } }  }   

            return false;
    }
     public static void main(String[] args){
        Scanner nums = new Scanner(System.in);
        System.out.println("enter a postive integer for variable n");
        int n= nums.nextInt(); 
        System.out.println("enter a postive integer for variable k");       
        int k= nums.nextInt();
        System.out.println(hasKSmallFactors(n,k));
 }
}
