/* An integer is defined to be an even subset of another integer n if every even factor of m is also a factor of n. For
example 18 is an even subset of 12 because the even factors of 18 are 2 and 6 and these are both factors of 12. But 18 is
not an even subset of 32 because 6 is not a factor of 32.
Write a function with signature int isEvenSubset(int m, int n) that returns 1 if m is an even subset of n, otherwise it
returns 0. */

import java.util.Scanner;
public class Dual_array {
    static int isEvenSubset(int m, int n) {
        boolean flag = false;
        for(int i=2; i<m; i++){
        if(m%i==0 && i%2==0){
            flag=false;
            for(int j=2; j<n; j++){
                if(n%j==0 && n%2==0){
                    if(i==j)
                        flag=true;
                }
            }    
            if(!flag)
            return 0;}}    
  return 1;          
    
}
    public static void main(String[] args){

        Scanner num= new Scanner(System.in);
        System.out.println("Enter a number M");
        int M= num.nextInt();
        System.out.println("Enter a number N");
        int N= num.nextInt();
        
        System.out.println(isEvenSubset(M,N)); 
}


}
